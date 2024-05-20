package com.example.goodreads.dao.repositories;

import com.example.goodreads.dao.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
