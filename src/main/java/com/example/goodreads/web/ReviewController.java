package com.example.goodreads.web;


import com.example.goodreads.dao.entities.Review;
import com.example.goodreads.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public List<Review> getReviews() {
        return reviewService.getAllReviews();
    }

    @GetMapping("/{id}")
    public Review getReview(@PathVariable int id) {
        return reviewService.getReviewById(id);
    }

    @PostMapping
    public Review addReview(Review review) {
        return reviewService.addReview(review);
    }

    @PutMapping
    public Review updateReview(Review review) {
        return reviewService.updateReview(review);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable int id) {
         reviewService.deleteReviewById(id);
    }

}
