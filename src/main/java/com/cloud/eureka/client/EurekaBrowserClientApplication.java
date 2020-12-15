package com.cloud.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.cloud.eureka")
@EnableEurekaClient
public class EurekaBrowserClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaBrowserClientApplication.class, args);
	}

}
