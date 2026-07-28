package com.guiserretti.spring_boot_sketch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiserretti.spring_boot_sketch.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
