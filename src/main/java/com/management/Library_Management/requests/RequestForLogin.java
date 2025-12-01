package com.management.Library_Management.requests;

import lombok.Data;

@Data
public class RequestForLogin {
    private String email;
    private String password;
}
