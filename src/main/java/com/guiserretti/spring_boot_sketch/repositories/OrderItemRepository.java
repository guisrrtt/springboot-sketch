package com.guiserretti.spring_boot_sketch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiserretti.spring_boot_sketch.entities.OrderItem;
import com.guiserretti.spring_boot_sketch.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
