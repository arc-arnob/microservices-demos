package com.servicea.serviceazuuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceazuuldemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceazuuldemoApplication.class, args);
	}

}
