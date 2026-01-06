package com.management.Library_Management.requests;

import jakarta.persistence.Column;
import jakarta.persistence.Transient;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestForRegistration {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
    private Date dob;
    private String addressLine;
    private String password;
    private String confirmPassword;

}
