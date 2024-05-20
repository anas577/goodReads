package com.example.goodreads.dao.repositories;
import com.example.goodreads.dao.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
