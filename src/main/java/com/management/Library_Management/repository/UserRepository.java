package com.management.Library_Management.repository;

import com.management.Library_Management.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, String> {

    @Query("select u from User u where u.email = ?1")
    User getUserByEmailId(String email);
}




