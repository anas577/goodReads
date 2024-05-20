package com.example.goodreads.web;


import com.example.goodreads.dao.entities.User;
import com.example.goodreads.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping
    public User addUser(User user) {
        return userService.addUser(user);
    }



}
