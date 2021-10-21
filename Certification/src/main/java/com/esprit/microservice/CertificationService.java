package com.esprit.microservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

public class CertificationService {
	@Autowired
	private CertificationRepository certificationRepository;
	
	public Certification addCertification(Certification certification) {
		return certificationRepository.save(certification);
	}
	 public List<Certification> getAllCategories()  {

	        List<Certification> certification = certificationRepository.findAll();
	        return certification.stream().collect(Collectors.toList());
	    }

}
