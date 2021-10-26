package com.esprit.microservice;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Integer> {
	@Query("select c from Cours c where c.title like :title")
	public List<Cours> coursByTitle(@Param("title") String title );
	
}
