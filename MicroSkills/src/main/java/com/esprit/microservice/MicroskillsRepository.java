package com.esprit.microservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MicroskillsRepository extends JpaRepository<Microskills, Integer> {
	@Query("select c from Microskills c where c.Name like :Name")
	public List<Microskills> MicroskillsByName(@Param("Name") String Name );
}