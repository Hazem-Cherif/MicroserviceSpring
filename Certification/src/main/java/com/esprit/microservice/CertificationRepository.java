package com.esprit.microservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificationRepository  extends JpaRepository<Certification, Integer>  {
	@Query("select c from Certification c where c.instituteName like :instituteName")
	public List<Certification> certificationByInstituteName(@Param("instituteName") String instituteName );
}
