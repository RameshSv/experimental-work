package com.eureka.cloud.eurekafeignclientconsumer.services;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(url="http://localhost:8073/netflix" , name="eureka-client-producer")
@FeignClient(name="eureka-client-producer", path="/netflix")
public interface RemoteCallService {
	
	@GetMapping(value="/hello")
	public String getMessage();

}