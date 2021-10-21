package com.esprit.microservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursService {
	
	@Autowired
	private CoursRepository categorieRepository;
	
	public Cours addCategorie(Cours courss) {
		return categorieRepository.save(courss);
	}
	 public List<Cours> getAllCategories()  {

	        List<Cours> courss = categorieRepository.findAll();
	        return courss.stream().collect(Collectors.toList());
	    }
}
