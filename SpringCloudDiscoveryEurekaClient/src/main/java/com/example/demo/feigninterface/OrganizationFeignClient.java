package com.example.demo.feigninterface;

import org.springframework.cloud.netflix.hystrix.HystrixProperties;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.example.demo.rest.controller.FeignController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@FeignClient(name="config-client" /*,fallback=CustomerClientFallback.class*/)
public interface OrganizationFeignClient {

	
	@RequestMapping(
		      value = "/whoami/{username}", 
		      method = RequestMethod.GET)
	public String whoami(@PathVariable("username") String username);
	

}
