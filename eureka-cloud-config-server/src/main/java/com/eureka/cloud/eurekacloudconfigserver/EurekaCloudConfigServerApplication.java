package com.eureka.cloud.eurekacloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EurekaCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCloudConfigServerApplication.class, args);
	}
}
