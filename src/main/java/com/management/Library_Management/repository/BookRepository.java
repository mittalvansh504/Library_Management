package com.management.Library_Management.repository;

import com.management.Library_Management.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, String> {

    List<Book> findByBookNameContainingIgnoreCase(String bookName);

    List<Book> findByAuthorNameContainingIgnoreCase(String authorName);
}
