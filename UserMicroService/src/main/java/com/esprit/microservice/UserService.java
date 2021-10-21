package com.esprit.microservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository categorieRepository;
	
	public User addCategorie(User categorie) {
		return categorieRepository.save(categorie);
	}
	 public List<User> getAllCategories()  {

	        List<User> categories = categorieRepository.findAll();
	        return categories.stream().collect(Collectors.toList());
	    }
}
