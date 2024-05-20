package com.example.goodreads.dao.repositories;

import com.example.goodreads.dao.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
