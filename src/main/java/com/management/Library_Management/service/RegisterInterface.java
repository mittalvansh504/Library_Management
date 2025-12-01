package com.management.Library_Management.service;

import com.management.Library_Management.entities.User;
import com.management.Library_Management.requests.RequestForLogin;
import com.management.Library_Management.requests.RequestForRegistration;

import java.util.List;
import java.util.Optional;

public interface RegisterInterface {

    void addUser(RequestForRegistration requestForRegistration);
    List<User> getAllData();
    Optional<User> getUserById(String id);

    void loginUser(RequestForLogin requestForLogin);

    User getUserByEmailId(String emailId);

}
