package com.example.goodreads.service;

import com.example.goodreads.dao.entities.Author;

import java.util.List;

public interface AuthorManager {
    public Author addAuthor(Author author);
    public Author getAuthorById(int id);
    public Author updateAuthor(Author author);
    public boolean deleteAuthorById(int id);
    public boolean deleteAuthor(Author author);
    public List<Author> getAllAuthors();
}
