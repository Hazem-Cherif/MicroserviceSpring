package com.esprit.microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CertificationRestapi {
	   private String title="hello categorie microService ";


	    @RequestMapping("/hello")
	    public String sayHello() {
	        System.out.println(title);
	        return title;
	    }
}
