package com.exmp.app.userprofile.service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmp.app.userprofile.entity.User;
import com.exmp.app.userprofile.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public List<User> getAllUsers(){
		List<User> userList = new ArrayList<User>();
		userList = userRepo.findAll();
		if(userList.isEmpty() || userList.size() == 0) {
			System.out.println("size "+userList.size());
			throw new RuntimeException();
		}
		return userList;
	}
	
	public List<User> getAllActiveUsers(){
		List<User> userList = new ArrayList<User>();
		userList = userRepo.findAllActiveUsers();
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
		return user;
	}
	
	public boolean deleteByUserId(Long id){
		userRepo.deleteByUserId(id, OffsetDateTime.now());
		return true;
	}

	public boolean deletePermanentByUserId(Long id) {
		userRepo.deleteById(id);
		return true;
	}

}
