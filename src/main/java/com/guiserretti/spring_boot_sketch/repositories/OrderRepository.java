package com.guiserretti.spring_boot_sketch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiserretti.spring_boot_sketch.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
