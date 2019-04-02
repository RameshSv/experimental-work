package com.springbt.app.springbtsecurity.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ramesh Sv
 * 
 * ApplicationProfiler class provides mode of application like dev or test
 * 
 * Here we can get property values in three ways
 * 1- Using @Value("${security.appMode}")
 * 2- Using @ConfigurationProperties
 * 
 */

@ConfigurationProperties("security") // Step-2
@RestController
@RequestMapping("/security")
public class ApplicationProfiler {
	
	private static final Logger logger = LoggerFactory.getLogger(ApplicationProfiler.class);
	
//	@Value("${security.appMode}")// Step-1
	private String appMode;
	private String author;
	
	

	@GetMapping("/appMode")
	public String getApplicationMode() {
		logger.debug("AppMode :"+appMode+" author "+author);
		return appMode;
	}
	
	public String getAppMode() {
		return appMode;
	}

	public void setAppMode(String appMode) {
		this.appMode = appMode;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
