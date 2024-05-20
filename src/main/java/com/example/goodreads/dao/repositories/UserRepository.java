package com.example.goodreads.dao.repositories;

import com.example.goodreads.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer>{
    public User findUserByUsername(String username);
}
