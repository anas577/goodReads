package com.example.goodreads.service;

import com.example.goodreads.dao.entities.Rating;
import com.example.goodreads.dao.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService implements RatingManager{
    @Autowired
    public RatingRepository ratingRepository;

    @Override
    public Rating addRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public Rating updateRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public Rating getRatingById(int id) {
        return ratingRepository.findById(id).get();
    }

    @Override
    public boolean deleteRatingById(int id) {
        try{
            ratingRepository.deleteById(id);
            return true;
        }catch (Exception exception){
            return false;
        }
    }

    @Override
    public boolean deleteRating(Rating rating) {
        try{
            ratingRepository.delete(rating);
            return true;
        }
        catch (Exception exception){
            return false;
        }
    }

    @Override
    public double getAverageRatingByBookId(int bookId) {
        return ratingRepository.getAverageRatingByBookId(bookId);
    }

    @Override
    public int getRatingCountByBookId(int bookId) {
        return ratingRepository.getRatingCountByBookId(bookId);
    }
}
