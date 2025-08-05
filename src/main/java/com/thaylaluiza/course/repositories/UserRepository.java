package com.thaylaluiza.course.repositories;

import com.thaylaluiza.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
