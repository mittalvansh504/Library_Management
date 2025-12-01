package com.management.Library_Management.repository;

import com.management.Library_Management.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, String> {

}
