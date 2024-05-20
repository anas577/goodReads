package com.example.goodreads.service;

import com.example.goodreads.dao.entities.Review;
import com.example.goodreads.dao.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService implements ReviewManager{
    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Review getReviewById(int id) {
        return reviewRepository.findById(id).get();
    }

    @Override
    public Review updateReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public boolean deleteReviewById(int id) {
        try{
            reviewRepository.deleteById(id);
            return true;
        }catch (Exception exception){
            return false;
        }
    }

    @Override
    public boolean deleteReview(Review review) {
        try{
            reviewRepository.delete(review);
            return true;
        }
        catch (Exception exception){
            return false;
        }
    }

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }
}
