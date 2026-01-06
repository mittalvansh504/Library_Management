package com.management.Library_Management.service;

import com.management.Library_Management.entities.Book;
import com.management.Library_Management.requests.RequestForBook;

import java.util.List;
import java.util.Optional;

public interface BookInterface {

    void addBook(RequestForBook requestForBook);

    List<Book> searchbook(String bookName);

    List<Book> searchauthorname(String authorName);
}
