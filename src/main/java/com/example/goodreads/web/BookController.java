package com.example.goodreads.web;

import com.example.goodreads.dao.entities.Book;
import com.example.goodreads.service.BookManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/boooks")
public class BookController {
    @Autowired
    private BookManager bookManager;

    @GetMapping
    public List<Book> allBooks(){
        return bookManager.getAllBooks();
    }
}
