package com.kaliandra.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaliandra.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
