package com.example.goodreads.dao.repositories;

import com.example.goodreads.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
