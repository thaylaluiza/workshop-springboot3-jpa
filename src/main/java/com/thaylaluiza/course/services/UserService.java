package com.thaylaluiza.course.services;

import com.thaylaluiza.course.entities.User;
import com.thaylaluiza.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }


    public User findBy(Long id ) {
        Optional<User> obj = repository.findById(id);
        return obj.get();



   }

   public User insert(User obj) {
        return repository.save(obj);
   }

   public void delete(Long id) {
        repository.deleteById(id);
   }
}
