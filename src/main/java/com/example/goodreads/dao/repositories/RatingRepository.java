package com.example.goodreads.dao.repositories;

import com.example.goodreads.dao.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Integer>{
    double getAverageRatingByBookId(int bookId);

    int getRatingCountByBookId(int bookId);
}
