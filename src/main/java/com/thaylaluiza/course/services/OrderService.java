package com.thaylaluiza.course.services;

import com.thaylaluiza.course.entities.Order;
import com.thaylaluiza.course.entities.User;
import com.thaylaluiza.course.repositories.OrderRepository;
import com.thaylaluiza.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }


    public Order findBy(Long id ) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();



    }
}
