package com.management.Library_Management.service;

import com.management.Library_Management.entities.Book;
import com.management.Library_Management.repository.BookRepository;
import com.management.Library_Management.requests.RequestForBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookImpl implements BookInterface{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void addBook(RequestForBook requestForBook){
        Book book = new Book();
        book.setBook_name(requestForBook.getBook_name());
        book.setPublished_by(requestForBook.getPublished_by());
        book.setPublished_On(requestForBook.getPublished_On());
        book.setPrice(requestForBook.getPrice());
        bookRepository.save(book);
    }

    @Override
    public List<Book> getBook(){
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(String id){
        return bookRepository.findById(id);
    }

    @Override
    public Book getbyname(String name) {
        return bookRepository.getbyname(name);
    }
}
