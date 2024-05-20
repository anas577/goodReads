package com.example.goodreads.service;



import com.example.goodreads.dao.entities.Book;
import java.util.List;

public interface BookManager {
    public Book addBook(Book book);
    public Book updateBook(Book book);
    public Book getBookById(int id);
    public boolean deleteBookById(int id);
    public boolean deleteBook(Book book);
    public List<Book> getAllBooks();
}
