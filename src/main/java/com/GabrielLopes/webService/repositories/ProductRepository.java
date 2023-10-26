package com.GabrielLopes.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GabrielLopes.webService.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
