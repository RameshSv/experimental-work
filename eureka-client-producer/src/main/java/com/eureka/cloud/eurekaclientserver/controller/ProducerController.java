package com.eureka.cloud.eurekaclientserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/netflix")
public class ProducerController {

	@GetMapping("/hello")
	public String sayGreetings() {
		return "Hello... Welcome to Bhavishya world";
	}
	
}
