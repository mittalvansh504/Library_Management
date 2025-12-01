package com.management.Library_Management.service;

import com.management.Library_Management.entities.RentedBook;
import com.management.Library_Management.requests.RequestForRentedBooks;

public interface RentedInterface {
    void addrentedbook(RequestForRentedBooks requestForRentedBooks);

    RentedBook bookbyname(String name);

    RentedBook bookbyauthor(String author);
}
