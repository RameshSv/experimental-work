package com.home.hremployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.home.hremployee.entity.HrEmployee;
import com.home.hremployee.repo.HrEmployeeRepository;

@Service
public class HrEmployeeAdapter {
	
	HrEmployeeRepository userRepo;
	
	public List<HrEmployee> getAllUser(){
		List<HrEmployee> userList = new ArrayList<HrEmployee>();
		userList = userRepo.findAll();
		return userList;
	}
	
	public HrEmployee createUser(HrEmployee user){
		user = userRepo.save(user);
		return user;
	}
	
	public Optional<HrEmployee> findByUserId(Long id){
		Optional<HrEmployee> user = userRepo.findById(id);
		return user;
	}

	
}
