package com.example.goodreads.web;

import com.example.goodreads.dao.entities.Book;
import com.example.goodreads.dao.entities.User;
import com.example.goodreads.service.BookManager;
import com.example.goodreads.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;


@RestController
@RequestMapping("books")
public class BookController {
    @Autowired
    private BookManager bookManager;

    @GetMapping
    public List<Book> getAllBooks(){
        return bookManager.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id){
        return bookManager.getBookById(id);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return bookManager.addBook(book);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book){
        return bookManager.updateBook(book);
    }

    @DeleteMapping ("/{id}")
    void deleteBookById( @PathVariable int id){
        bookManager.deleteBookById(id);
    }





}
