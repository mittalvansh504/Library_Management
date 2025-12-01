package com.management.Library_Management.service;

import com.management.Library_Management.entities.Search;
import com.management.Library_Management.requests.RequestForSearch;

import java.util.List;

public interface SearchInterface {
    void addbook(RequestForSearch requestForSearch);

    List<Search> searchbook(String bookname);

    List<Search> searchbookbyauthor(String authorname);
}
