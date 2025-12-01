package com.management.Library_Management.Controller;

import com.management.Library_Management.entities.Author;
import com.management.Library_Management.requests.RequestForAuthor;
import com.management.Library_Management.service.AuthorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    private AuthorInterface authorInterface;

    @PostMapping("/postname")
    public String addauthorname(@RequestBody RequestForAuthor requestForAuthor){
        authorInterface.addName(requestForAuthor);
        return "Done";
    }

    @GetMapping("/getname")
    public List<Author> getingname(){
        return authorInterface.getName();
    }
}
