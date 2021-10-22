package com.esprit.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableDiscoveryClient
public class UserMicroServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(UserMicroServiceApplication.class, args);
	}
	@Autowired
	private UserRepository repository;
	
	@Bean
	ApplicationRunner init() {
		return (args) -> {
			// save
			repository.save(new User("Mariem", "Ch", "ma@esprit.tn"));
			repository.save(new User("Sarra", "ab", "sa@esprit.tn"));
			repository.save(new User("Mohamed", "ba", "mo@esprit.tn"));
			// fetch
			repository.findAll().forEach(System.out::println);
		};
	}
}
