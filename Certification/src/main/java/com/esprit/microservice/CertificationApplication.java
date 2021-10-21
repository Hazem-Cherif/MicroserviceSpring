package com.esprit.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class CertificationApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CertificationApplication.class, args);
	}
	@Autowired
	private CertificationRepository repository;
	
	@Bean
	ApplicationRunner init() {
		return (args) -> {
			// save
			
			// fetch
			repository.findAll().forEach(System.out::println);
		};
	}
}
