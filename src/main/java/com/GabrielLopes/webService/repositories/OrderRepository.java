package com.GabrielLopes.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GabrielLopes.webService.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
