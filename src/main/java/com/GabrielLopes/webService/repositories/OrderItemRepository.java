package com.GabrielLopes.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GabrielLopes.webService.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
