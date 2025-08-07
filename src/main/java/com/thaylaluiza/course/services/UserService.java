package com.thaylaluiza.course.services;

import com.thaylaluiza.course.entities.User;
import com.thaylaluiza.course.repositories.UserRepository;
import com.thaylaluiza.course.services.exceptions.ResourceNotFoundException;
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
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));



   }

   public User insert(User obj) {
        return repository.save(obj);
   }

   public void delete(Long id) {
        repository.deleteById(id);
   }

   public User update(Long id , User obj ) {
        User entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
   }

    private void updateData(User entity, User obj) {
        entity.setNome(obj.getNome());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }


}
