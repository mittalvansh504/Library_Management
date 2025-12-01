package com.management.Library_Management.Controller;


import com.management.Library_Management.entities.Search;
import com.management.Library_Management.requests.RequestForSearch;
import com.management.Library_Management.service.SearchInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchInterface searchInterface;

    @PostMapping("/addbookname")
    public String addbook(@RequestBody RequestForSearch requestForSearch){
        searchInterface.addbook(requestForSearch);
        return "Done";
    }

    @GetMapping("/bookbyname/{bookname}")
    public List<Search> serachbook(@PathVariable String bookname){
        return searchInterface.searchbook(bookname);
    }

    @GetMapping("/bookbyauthor/{authorname}")
    public List<Search> serachbookbyauthor(@PathVariable String authorname){
        return searchInterface.searchbookbyauthor(authorname);
    }
}
