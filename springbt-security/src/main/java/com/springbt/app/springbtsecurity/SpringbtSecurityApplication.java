package com.springbt.app.springbtsecurity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Ramesh Sv
 *
 */
@SpringBootApplication
public class SpringbtSecurityApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringbtSecurityApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbtSecurityApplication.class, args);
		logger.debug("Aplication Started");
	}
	
	//http://localhost:8070/springbt-security/security/appMode
	//http://localhost:8070/springbt-security/swagger-ui.html
	
}
