package com.sb.app.userprofile.service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.app.userprofile.entity.User;
import com.sb.app.userprofile.exception.RecordNotFoundException;
import com.sb.app.userprofile.exception.UnModificationException;
import com.sb.app.userprofile.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public List<User> getAllUsers(){
		List<User> userList = new ArrayList<User>();
		userList = userRepo.findAll();
		if(userList.isEmpty() || userList.size() == 0) {
			throw new RecordNotFoundException("Empty List");
		}
		return userList;
	}
	
	public List<User> getAllActiveUsers(){
		List<User> userList = new ArrayList<User>();
		userList = userRepo.findAllActiveUsers();
		if(userList.isEmpty() || userList.size() == 0) {
			throw new RecordNotFoundException("Empty List");
		}
		return userList;
	}
	
	public User createUser(User user){
		user.setIsActive('Y');
		user.setUpdatedDate(OffsetDateTime.now());
		user = userRepo.save(user);
		return user;
	}
	
	public Optional<User> findByUserId(Long id){
		Optional<User> user = userRepo.findById(id);
		if(user.isEmpty()) {
			throw new RecordNotFoundException("Record Not Found: UserId "+id);
		}
		return user;
	}
	
	public boolean deleteByUserId(Long id){
		int i = userRepo.deleteByUserId(id, OffsetDateTime.now());
		if(i == 0) {
			throw new UnModificationException("Virtual Deleted Successfully : UserId "+id);
		}
		return true;
	}

	public boolean deletePermanentByUserId(Long id) {
		findByUserId(id);
		userRepo.deleteById(id);
		return true;
	}

}
