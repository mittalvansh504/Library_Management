package com.management.Library_Management.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestForBook {
    private String book_name;
    private String published_by;
    private Date published_On;
    private int price;
}
