package com.exmp.app.userprofile.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exmp.app.userprofile.entity.User;
import com.exmp.app.userprofile.service.UserService;

@RequestMapping("/v1")
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(path="/getallusers")
	public List<User> getAllUsers(@RequestHeader String host){
		return userService.getAllUsers();
	}
	
	@GetMapping(path="/getallactiveusers")
	public List<User> getAllActiveUsers(@RequestHeader String host){
		return userService.getAllActiveUsers();
	}

	@PostMapping(path="/createuser")
	public User createUser(@RequestBody User user){
		return userService.createUser(user);
	}

	@GetMapping(path="/findbyuserid/{id}")
	public Optional<User> findByUserId(@PathVariable Long id){
		return userService.findByUserId(id);
	}

	@GetMapping(path="/findbyuseridbyparam")
	public Optional<User> findByUserId1(@RequestParam Long id){
		return userService.findByUserId(id);
	}
	
	@PutMapping(path="/virtualdelete")
	public boolean virtualDelete(@RequestParam Long id){
		return userService.deleteByUserId(id);
	}
	
	@DeleteMapping(path="/permanentdelete")
	public boolean permanentDelete(@PathVariable Long id){
		return userService.deletePermanentByUserId(id);
	}

}
