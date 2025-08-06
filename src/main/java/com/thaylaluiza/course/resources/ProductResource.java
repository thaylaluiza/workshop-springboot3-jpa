package com.thaylaluiza.course.resources;

import com.thaylaluiza.course.entities.Product;
import com.thaylaluiza.course.entities.User;
import com.thaylaluiza.course.services.ProductService;
import com.thaylaluiza.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {

        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);


    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = service.findBy(id);
        return ResponseEntity.ok().body(obj);
    }
}
