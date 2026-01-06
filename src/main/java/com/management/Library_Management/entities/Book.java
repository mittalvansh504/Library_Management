package com.management.Library_Management.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String bookId;

    @Column(unique = true)
    private String bookName;
    private String authorName;
    private String description;
    private int price;

    private String bookImage;

}
