package com.selimhorri.app.pack.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.selimhorri.app.pack.models.entities.UserCredential;

@Repository
public interface UserCredentialRepository extends JpaRepository<UserCredential, Integer> {
	
	@Query(name = "Optional.findByUsername", nativeQuery = true)
	public abstract Optional<UserCredential> findByUsername(@Param("username") final String username);
	
}








