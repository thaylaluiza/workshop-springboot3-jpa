package com.thaylaluiza.course.services;

import com.thaylaluiza.course.entities.Product;
import com.thaylaluiza.course.entities.User;
import com.thaylaluiza.course.repositories.ProductRepository;
import com.thaylaluiza.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }


    public Product findBy(Long id ) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();



    }
}

