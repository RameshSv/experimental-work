package com.eureka.cloud.eurekafeignclientconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EurekaFeignClientConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignClientConsumerApplication.class, args);
	}
}
