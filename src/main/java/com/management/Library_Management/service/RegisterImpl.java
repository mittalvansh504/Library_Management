package com.management.Library_Management.service;

import com.management.Library_Management.entities.User;
import com.management.Library_Management.repository.UserRepository;
import com.management.Library_Management.requests.RequestForLogin;
import com.management.Library_Management.requests.RequestForRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterImpl implements RegisterInterface{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(RequestForRegistration requestForRegistration) {
        User user = new User();
        user.setFirst_name(requestForRegistration.getFirst_name());
        user.setLast_name(requestForRegistration.getLast_name());
        user.setEmail(requestForRegistration.getEmail());
        user.setPhone_no(requestForRegistration.getPhone_no());
        user.setDob(requestForRegistration.getDob());
        user.setAddressLine(requestForRegistration.getAddressLine1() + " " + requestForRegistration.getAddressLine2());
        user.setPassword(requestForRegistration.getPassword());
        user.setConfirmPassword(requestForRegistration.getConfirmPassword());
        userRepository.save(user);
    }

    @Override
    public List<User> getAllData() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public void loginUser(RequestForLogin requestForLogin){
        User user = new User();
        user.setEmail(user.getEmail());
        user.setPassword(user.getPassword());
        userRepository.save(user);
    }

    @Override
    public User getUserByEmailId(String emailId) {
        User user = userRepository.getUserByEmailId(emailId);
        return user;
    }
}
