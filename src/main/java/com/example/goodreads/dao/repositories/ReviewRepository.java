package com.example.goodreads.dao.repositories;

import com.example.goodreads.dao.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer>{
}
