package com.management.Library_Management.repository;

import com.management.Library_Management.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CartRepository extends JpaRepository<Cart, String> {

    @Query("select c from Cart c where c.book_name = ?1")
    Cart getbookname(String bookname);

    @Query("select c from Cart c where c.published_by = ?1")
    Cart getauthorname(String authorname);
}
