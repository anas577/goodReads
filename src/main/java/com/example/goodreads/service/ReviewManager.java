package com.example.goodreads.service;

import com.example.goodreads.dao.entities.Review;

import java.util.List;

public interface ReviewManager {
    public Review addReview(Review review);
    public Review getReviewById(int id);
    public Review updateReview(Review review);
    public boolean deleteReviewById(int id);
    public boolean deleteReview(Review review);
    public List<Review> getAllReviews();
}
