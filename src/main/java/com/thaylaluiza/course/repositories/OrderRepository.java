package com.thaylaluiza.course.repositories;

import com.thaylaluiza.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
