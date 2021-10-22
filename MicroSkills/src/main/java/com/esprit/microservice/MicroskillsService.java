package com.esprit.microservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MicroskillsService {
	@Autowired
	private MicroskillsRepository MicroskillsRepository;
	
	public Microskills addCategorie(Microskills microskkils) {
		return MicroskillsRepository.save(microskkils);
	}
	 public List<Microskills> getAllCategories()  {

	        List<Microskills> microskkils = MicroskillsRepository.findAll();
	        return microskkils.stream().collect(Collectors.toList());
	    }

}
