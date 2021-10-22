package com.esprit.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroSkillsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroSkillsApplication.class, args);
	}
	@Autowired
	private MicroskillsRepository repository;
	
	@Bean
	ApplicationRunner init() {
		return (args) -> {
			// save
			repository.save(new Microskills(4, "ma@esprit.tn"));
			repository.save(new Microskills(5, "sa@esprit.tn"));
			repository.save(new Microskills( 6, "mo@esprit.tn"));
			// fetch
			repository.findAll().forEach(System.out::println);
		};
	}
}
