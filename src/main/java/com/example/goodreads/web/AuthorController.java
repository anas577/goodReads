package com.example.goodreads.web;

import com.example.goodreads.dao.entities.Author;
import com.example.goodreads.dao.repositories.AuthorRepository;
import com.example.goodreads.service.AuthorManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorManager authorManager;

    @GetMapping
    public List<Author> getAuthors(){
        return authorManager.getAllAuthors();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable int id){
        return authorManager.getAuthorById(id);
    }

    @PostMapping
    public Author addAuthor(@RequestBody Author author){
        return authorManager.addAuthor(author);
    }

    @PutMapping("/update")
    public Author updateAuthor(@RequestBody Author author){
        return authorManager.updateAuthor(author);
    }

    @DeleteMapping("/{id}")
    public void  deleteAuthor(@PathVariable int id){
        authorManager.deleteAuthorById(id);
    }

}
