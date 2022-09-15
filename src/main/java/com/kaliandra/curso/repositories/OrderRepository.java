package com.kaliandra.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaliandra.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
