package com.management.Library_Management.Controller;

import com.management.Library_Management.entities.Book;
import com.management.Library_Management.requests.RequestForBook;
import com.management.Library_Management.service.BookInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("/Books")
public class BookController {

    @Autowired
    private BookInterface bookInterface;

    @PostMapping("/book")
    public String addbook(@RequestBody RequestForBook requestForBook) {
        bookInterface.addBook(requestForBook);
        return "Book added Successfully";
    }

    @GetMapping("/bookbybookname/{bookName}")
    public List<Book> searchbook(@PathVariable String bookName){
        return bookInterface.searchbook(bookName);
    }

    @GetMapping("/bookbyauthorname/{authorName}")
    public List<Book> searchauthorname(@PathVariable String authorName){
        return bookInterface.searchauthorname(authorName);
    }
}
