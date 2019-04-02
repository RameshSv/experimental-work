package com.springbt.app.springbtsecurity.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
/**
 * @author Ramesh Sv
 * SpringSecurityRestController class provides to test Basic Authentication
 *
 */
@RestController
@RequestMapping("/security")
public class SpringSecurityRestController {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringSecurityRestController.class);
	
	@ApiOperation(value="Get Logged in user role", response=String.class)
	@GetMapping("/userRole")
	public String getUserRoles(@AuthenticationPrincipal final UserDetails userDetailstails) {
		String userName  = userDetailstails.getUsername();
		Collection<? extends GrantedAuthority> userRoles = userDetailstails.getAuthorities();
		logger.debug("Authorities :: "+userRoles.size());
		return userName+" role -> "+userRoles.toString();
	}
	

}
