package com.example.book.repository;  // Correct package

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.book.model.Book;  // Correct import

public interface BookRepository extends JpaRepository<Book, Long> {
}
