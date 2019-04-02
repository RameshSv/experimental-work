package com.exmp.app.restcontroller.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exmp.app.restcontroller.dao.User;
import com.exmp.app.restcontroller.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(path="/getallusers")
	public List<User> getAllUser(){
		
		return userService.getAllUser();
	}
	
	@PostMapping(path="/createuser")
	public User createUser(@RequestBody User user){
		return userService.createUser(user);
	}
	
	@GetMapping(path="/findbyuserid/{id}")
	public Optional<User> findByUserId(@PathVariable Long id){
		return userService.findByUserId(id);
	}
	
	@GetMapping(path="/findbyuserid1")
	public Optional<User> findByUserId1(@RequestParam Long id){
		return userService.findByUserId(id);
	}

}
