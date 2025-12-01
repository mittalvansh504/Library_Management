package com.management.Library_Management.service;

import com.management.Library_Management.entities.Author;
import com.management.Library_Management.requests.RequestForAuthor;

import java.util.List;

public interface AuthorInterface {
    void addName(RequestForAuthor requestForAuthor);
    List<Author> getName();
}
