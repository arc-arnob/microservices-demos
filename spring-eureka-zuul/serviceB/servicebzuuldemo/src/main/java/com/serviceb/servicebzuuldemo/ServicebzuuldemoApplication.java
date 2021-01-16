package com.serviceb.servicebzuuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicebzuuldemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicebzuuldemoApplication.class, args);
	}

}
