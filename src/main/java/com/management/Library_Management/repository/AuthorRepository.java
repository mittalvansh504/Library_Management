package com.management.Library_Management.repository;

import com.management.Library_Management.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, String> {

}
