package com.example.goodreads.service;

import com.example.goodreads.dao.entities.Rating;

public interface RatingManager {
    public Rating addRating(Rating rating);
    public Rating updateRating(Rating rating);
    public Rating getRatingById(int id);
    public boolean deleteRatingById(int id);
    public boolean deleteRating(Rating rating);
    public double getAverageRatingByBookId(int bookId);
    public int getRatingCountByBookId(int bookId);
}
