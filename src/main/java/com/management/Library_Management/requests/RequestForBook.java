package com.management.Library_Management.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestForBook {
    private String bookName;
    private String authorName;
    private String description;
    private int price;
    private String bookImage;
}
