package com.management.Library_Management.repository;

import com.management.Library_Management.entities.Search;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SearchRepository extends JpaRepository<Search, String> {
    @Query("select s from Search s where s.book_name = ?1")
    List<Search> searchbook(String bookname);

    @Query("select s from Search s where s.author_name = ?1")
    List<Search> searchbookbyauthor(String authorname);
}
