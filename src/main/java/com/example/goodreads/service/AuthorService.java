package com.example.goodreads.service;

import com.example.goodreads.dao.entities.Author;
import com.example.goodreads.dao.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorService implements AuthorManager{
    @Autowired
    private AuthorRepository authorRepository;
    @Override
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author getAuthorById(int id) {
        return authorRepository.findById(id).get();
    }

    @Override
    public Author updateAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public boolean deleteAuthorById(int id) {
        try{
            authorRepository.deleteById(id);
            return true;
        }catch (Exception exception){
            return false;
        }
    }

    @Override
    public boolean deleteAuthor(Author author) {
        try{
            authorRepository.delete(author);
            return true;
        }
        catch (Exception exception){
            return false;
        }
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
}
