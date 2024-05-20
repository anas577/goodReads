package com.example.goodreads.service;

import com.example.goodreads.dao.entities.User;

import java.util.List;

public interface UserManager {
    public User addUser(User user);
    public User updateUser(User user);
    public boolean deleteUser(User user);
    public boolean deleteUserById(Integer id);
    public List<User> getAllUsers();
    public User getUserById(Integer id);

    User getUserByUsername(String username);
}
