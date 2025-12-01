package com.management.Library_Management.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class RentedBook {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String book_id;
    private String book_name;
    private String author_name;
    private int price;



}
