package com.management.Library_Management.service;

import com.management.Library_Management.Exception.AuthorNotFoundException;
import com.management.Library_Management.Exception.BookNotFoundException;
import com.management.Library_Management.entities.Book;
import com.management.Library_Management.repository.BookRepository;
import com.management.Library_Management.requests.RequestForBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookImpl implements BookInterface{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void addBook(RequestForBook requestForBook){
        Book book = new Book();
        book.setBookName(requestForBook.getBookName());
        book.setAuthorName(requestForBook.getAuthorName());
        book.setDescription(requestForBook.getDescription());
        book.setPrice(requestForBook.getPrice());
        book.setBookImage(requestForBook.getBookImage());
        bookRepository.save(book);
    }

    @Override
    public List<Book> searchbook(String bookName){
        List<Book> books = bookRepository.findByBookNameContainingIgnoreCase(bookName);
        if(books.isEmpty()){
            throw new BookNotFoundException("Book is not present in our database");
        }
        return books;
    }

    @Override
    public List<Book> searchauthorname(String authorName){
        List<Book> authors = bookRepository.findByAuthorNameContainingIgnoreCase(authorName);
        if(authors.isEmpty()){
            throw new AuthorNotFoundException("Author is not present in our database");
        }
        return authors;
    }

}
