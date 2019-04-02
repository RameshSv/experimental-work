package com.eureka.cloud.eurekaclientservice.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/netflix/client")
public class ConsumerController {

	// @Autowired
	// private RestTemplate restTemplate;

//	@Autowired
//	private DiscoveryClient discoveryClient; // individual
	@Autowired  //load balance
	private LoadBalancerClient loadBalanceClient;

	@HystrixCommand(fallbackMethod="fallback", commandKey="hello", groupKey="greet")
	@GetMapping("/cHello")
	public String fetchGreetings() throws RestClientException, IOException {
		System.out.println("hi");
		// 1st method start
		// restTemplate.getForObject("http://localhost:8071/netflix/hello",
		// String.class);
		// 1st method end
		// 2 start
		// RestTemplate restTemplate = new RestTemplate();
		// ResponseEntity<String> response=null;
		// try{
		// response=restTemplate.exchange("http://localhost:8071/netflix/hello",
		// 2 end
		//3 start
//		List<ServiceInstance> instancesList = discoveryClient.getInstances("eureka-client-producer");
//		ServiceInstance serviceInstance = instancesList.get(0);
		// 3 end
		//4 load Balance
		ServiceInstance serviceInstance=loadBalanceClient.choose("eureka-client-producer");//Non-Zuul service
		// 4
		System.out.println("Host   ... "+serviceInstance.getHost());
		System.out.println(serviceInstance.getServiceId());
//		System.out.println(instancesList.size());
		String baseUrl = serviceInstance.getUri().toString();

		baseUrl = baseUrl + "/netflix/hello"; // Non-zuul
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = null;
		try {
			response = restTemplate.exchange(baseUrl, HttpMethod.GET, getHeaders(),
					String.class);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return response.getBody().toString()+" Client";
	}
	
	public String fallback(Throwable hystrix) {
		System.out.println(hystrix.getMessage());
		return "Hello Ramesh..Bhavi fallback.. help her..!";
	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}

}
