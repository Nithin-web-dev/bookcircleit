package com.example.book.services;

import com.example.book.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book addBook(Book book);
}
