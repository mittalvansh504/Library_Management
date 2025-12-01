package com.management.Library_Management.requests;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestForRegistration {

    private String first_name;
    private String last_name;
    private String email;
    private String phone_no;
    private Date dob;
    private String addressLine1;
    private String addressLine2;
    private String password;
    private String confirmPassword;

}
