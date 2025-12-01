package com.management.Library_Management.Controller;

import com.management.Library_Management.entities.Book;
import com.management.Library_Management.requests.RequestForBook;
import com.management.Library_Management.service.BookInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Books")
public class BookController {

    @Autowired
    private BookInterface bookInterface;

    @PostMapping("/book")
    public String addbook(@RequestBody RequestForBook requestForBook) {
        bookInterface.addBook(requestForBook);
        return "";
    }

    @GetMapping("/bookData")
    public List<Book> getbook() {
        return bookInterface.getBook();
    }

    @GetMapping("/getbookby/{id}")
    public Optional<Book> bookByName(@PathVariable String id) {
        return bookInterface.getBookById(id);
    }

    @GetMapping("/GetBookByName/{name}")
    public Book getbyname(@PathVariable String name){
        return bookInterface.getbyname(name);
    }
}
