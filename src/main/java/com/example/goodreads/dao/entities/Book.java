package com.example.goodreads.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private String coverPicture;
    private Date publicationDate;
    private double rating;
    private Integer pages;
    @ManyToOne
    private Author author;
    @ManyToMany
    private List<Category> categories;
    @OneToMany(mappedBy = "book")
    private List<Review> reviews;
    @OneToMany(mappedBy = "book")
    private List<Rating> ratings; ;


}
