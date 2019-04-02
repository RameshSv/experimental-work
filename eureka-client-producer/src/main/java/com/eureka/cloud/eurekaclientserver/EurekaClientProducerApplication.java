package com.eureka.cloud.eurekaclientserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientProducerApplication.class, args);
	}
}
