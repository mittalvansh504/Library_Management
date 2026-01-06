package com.management.Library_Management.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String bookId;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "published_by")
    private String publishedBy;

    private double price;
}
