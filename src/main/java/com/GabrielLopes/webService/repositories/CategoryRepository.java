package com.GabrielLopes.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GabrielLopes.webService.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
