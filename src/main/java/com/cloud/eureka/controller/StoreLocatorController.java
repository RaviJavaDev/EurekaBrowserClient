package com.cloud.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StoreLocatorController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/getstores")
	public String getAllStores() {

		ResponseEntity<String> stores = restTemplate.exchange("http://Client1/getstoreinfo", HttpMethod.GET, null,
				String.class);

		return stores.getBody();
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
