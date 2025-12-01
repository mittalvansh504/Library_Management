package com.management.Library_Management.service;

import com.management.Library_Management.entities.Search;
import com.management.Library_Management.repository.SearchRepository;
import com.management.Library_Management.requests.RequestForSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchImpl implements SearchInterface{

    @Autowired
    private SearchRepository searchRepository;

    @Override
    public void addbook(RequestForSearch requestForSearch){
        Search search = new Search();
        search.setBook_name(requestForSearch.getBook_name());
        search.setAuthor_name(requestForSearch.getAuthor_name());
        searchRepository.save(search);
    }

    @Override
    public List<Search> searchbook(String bookname) {
        return searchRepository.searchbook(bookname);
    }

    @Override
    public List<Search> searchbookbyauthor(String authorname) {
        return searchRepository.searchbookbyauthor(authorname);
    }
}
