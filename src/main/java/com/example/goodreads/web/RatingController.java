package com.example.goodreads.web;


import com.example.goodreads.dao.entities.Rating;
import com.example.goodreads.service.RatingManager;
import com.example.goodreads.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingManager ratingService;

    @PostMapping
    public Rating addRating(Rating rating) {
        return ratingService.addRating(rating);
    }

    @PutMapping
    public Rating updateRating(Rating rating) {
        return ratingService.updateRating(rating);
    }

    @GetMapping("/{id}")
    public Rating getRatingById(@PathVariable int id) {
        return ratingService.getRatingById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteRatingById(@PathVariable int id) {
        ratingService.deleteRatingById(id);
    }

//    @GetMapping("/{id}")
//    public double getAverageRating(@PathVariable int id) {
//        return ratingService.getAverageRatingByBookId(id);
//    }

    @GetMapping("ratingCount/{id}")
    public int getRatingCountByBookId(@PathVariable int id) {
        return ratingService.getRatingCountByBookId(id);
    }

}
