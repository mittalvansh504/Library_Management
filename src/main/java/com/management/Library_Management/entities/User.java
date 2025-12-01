package com.management.Library_Management.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String user_id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone_no;
    private Date dob;
    private String addressLine;
    private String password;
    private String confirmPassword;

}
