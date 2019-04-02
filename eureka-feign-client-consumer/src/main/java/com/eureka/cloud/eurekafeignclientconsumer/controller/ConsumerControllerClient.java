package com.eureka.cloud.eurekafeignclientconsumer.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.eureka.cloud.eurekafeignclientconsumer.services.RemoteCallService;

@RestController
public class ConsumerControllerClient {

	@Autowired
	private RemoteCallService remoteCallService;
	
	@GetMapping("/cfHello")
	public String getFeignMessage() throws RestClientException, IOException {
		String msg = " feign";
		try {
			msg = remoteCallService.getMessage() + msg;
			System.out.println("msg  "+msg);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return msg;
	}

}