package com.management.Library_Management.service;

import com.management.Library_Management.entities.Author;
import com.management.Library_Management.repository.AuthorRepository;
import com.management.Library_Management.requests.RequestForAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorImpl implements AuthorInterface{

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public void addName(RequestForAuthor requestForAuthor) {
        Author author = new Author();
        author.setName(author.getName());
        authorRepository.save(author);
    }

    @Override
    public List<Author> getName() {
        return authorRepository.findAll();
    }

}
