package com.management.Library_Management.repository;

import com.management.Library_Management.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

    boolean existsByPhoneNo(String phoneNo);

    Optional<User> findByEmail(String email);
}
