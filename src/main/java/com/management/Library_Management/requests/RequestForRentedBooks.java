package com.management.Library_Management.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestForRentedBooks {
    private String book_name;
    private String author_name;
    private int price;
}
