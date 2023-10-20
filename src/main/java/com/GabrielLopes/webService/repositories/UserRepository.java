package com.GabrielLopes.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GabrielLopes.webService.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
