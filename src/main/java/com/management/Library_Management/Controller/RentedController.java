package com.management.Library_Management.Controller;

import com.management.Library_Management.entities.RentedBook;
import com.management.Library_Management.requests.RequestForRentedBooks;
import com.management.Library_Management.service.AuthorInterface;
import com.management.Library_Management.service.RentedInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RentedController {

    @Autowired
    private RentedInterface rentedInterface;
    @Autowired
    private AuthorInterface authorInterface;

    @PostMapping("/rentedbooks")
    public String rented1(@RequestBody RequestForRentedBooks requestForRentedBooks){
        rentedInterface.addrentedbook(requestForRentedBooks);
        return "Done";
    }

    @GetMapping("/getbookbyname/{name}")
    public RentedBook bookbyname(@PathVariable String name){
        return rentedInterface.bookbyname(name);
    }

    @GetMapping("/getbookbyauthor/{authorname}")
    public RentedBook bookbyauthor(@PathVariable String authorname){
        return rentedInterface.bookbyauthor(authorname);
    }
}
