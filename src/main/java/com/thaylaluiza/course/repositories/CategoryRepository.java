package com.thaylaluiza.course.repositories;

import com.thaylaluiza.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category , Long> {
}
