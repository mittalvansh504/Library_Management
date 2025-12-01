package com.management.Library_Management.repository;

import com.management.Library_Management.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, String> {

    @Query("select b from Book b where b.book_name = ?1")
    Book getbyname(String name);
}
