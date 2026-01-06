package com.management.Library_Management.service;

import com.management.Library_Management.entities.RentedBook;
import com.management.Library_Management.repository.RentedBookRepository;
import com.management.Library_Management.requests.RequestForRentedBooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentedImpl implements RentedInterface {

    @Autowired
    private RentedBookRepository repository;

    @Override
    public void addrentedbook(RequestForRentedBooks requestForRentedBooks) {
        RentedBook rb = new RentedBook();
        rb.setBook_name(requestForRentedBooks.getBook_name());
        rb.setAuthor_name(requestForRentedBooks.getAuthor_name());
        rb.setPrice(requestForRentedBooks.getPrice());
        repository.save(rb);
    }

    @Override
    public RentedBook bookbyname(String name){
        return repository.bookbyname(name);
    }

    @Override
    public RentedBook bookbyauthor(String author) {
        return repository.bookbyauthor(author);
    }
}
