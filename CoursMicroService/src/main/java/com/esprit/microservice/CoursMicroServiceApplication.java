package com.esprit.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class CoursMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursMicroServiceApplication.class, args);
	}
	@Autowired
	private CoursRepository repository;
	
	@Bean
	ApplicationRunner init() {
		return (args) -> {
			// save
			repository.save(new Cours(1,"react", "reactDescription", "informatique",  "hazem hadhri"));
			
			// fetch
			repository.findAll().forEach(System.out::println);
		};
	}
}
