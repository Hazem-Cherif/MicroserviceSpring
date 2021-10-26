package com.esprit.microservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursService {
	
	@Autowired
	private CoursRepository coursRepository;
	
	public Cours addCategorie(Cours courss) {
		return coursRepository.save(courss);
	}
	 public List<Cours> getAllCours()  {

	        List<Cours> courss = coursRepository.findAll();
	        return courss.stream().collect(Collectors.toList());
	    }
}
