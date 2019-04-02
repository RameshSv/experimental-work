package com.exmp.app.restcontroller.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmp.app.restcontroller.dao.User;
import com.exmp.app.restcontroller.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public List<User> getAllUser(){
		List<User> userList = new ArrayList<User>();
		userList = userRepo.findAll();
		return userList;
	}
	
	public User createUser(User user){
		user = userRepo.save(user);
		return user;
	}
	
	public Optional<User> findByUserId(Long id){
		Optional<User> user = userRepo.findById(id);
		return user;
	}

}
