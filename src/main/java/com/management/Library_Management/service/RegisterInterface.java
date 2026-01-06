package com.management.Library_Management.service;

import com.management.Library_Management.entities.User;
import com.management.Library_Management.requests.RequestForLogin;
import com.management.Library_Management.requests.RequestForRegistration;

import java.util.List;
import java.util.Optional;

public interface RegisterInterface {

    User addUser(RequestForRegistration request);

    List<User> getAllData();

    Optional<User> getUserById(Long id);

    boolean loginUser(RequestForLogin request);
}
