package com.example.goodreads.service;

import com.example.goodreads.dao.entities.Book;
import com.example.goodreads.dao.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService implements BookManager{
    @Autowired
    private BookRepository bookRepository;
    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public boolean deleteBookById(int id) {
        try{
            bookRepository.deleteById(id);
            return true;
        }catch (Exception exception){
            return false;
        }
    }

    @Override
    public boolean deleteBook(Book book) {
        try{
            bookRepository.delete(book);
            return true;
        }
        catch (Exception exception){
            return false;
        }
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
