package com.management.Library_Management.repository;

import com.management.Library_Management.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, String> {

    List<Cart> findByBookName(String bookName);

    List<Cart> findByPublishedBy(String publishedBy);
}
