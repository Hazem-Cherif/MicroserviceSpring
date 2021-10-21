package com.esprit.microservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("select c from User c where c.firstName like :firstName")
	public List<User> userByFirstName(@Param("firstName") String firstName );
}
