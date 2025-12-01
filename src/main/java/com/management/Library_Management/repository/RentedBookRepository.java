package com.management.Library_Management.repository;

import com.management.Library_Management.entities.RentedBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RentedBookRepository extends JpaRepository<RentedBook, String> {
    @Query("select r from RentedBook r where r.book_name = ?1")
    RentedBook bookbyname(String name);

    @Query("select r from RentedBook r where r.author_name = ?1")
    RentedBook bookbyauthor(String author);
}
