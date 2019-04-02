package com.eureka.cloud.eurekaclientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientConsumerApplication.class, args);
	}
}
