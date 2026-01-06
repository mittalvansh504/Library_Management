package com.management.Library_Management.service;

import com.management.Library_Management.entities.User;
import com.management.Library_Management.repository.UserRepository;
import com.management.Library_Management.requests.RequestForLogin;
import com.management.Library_Management.requests.RequestForRegistration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class RegisterImpl implements RegisterInterface {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(RequestForRegistration request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("User already exists with this email");
        }

        if (userRepository.existsByPhoneNo(request.getPhoneNo())) {
            throw new RuntimeException("User already exists with this phone number");
        }

        if (!request.getPassword().equals(request.getConfirmPassword())) {
            throw new RuntimeException("Password and Confirm Password do not match");
        }

        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPhoneNo(request.getPhoneNo());
        user.setDob(request.getDob());
        user.setAddressLine(request.getAddressLine());
        user.setPassword(request.getPassword());

        return userRepository.save(user);
    }

    @Override
    public List<User> getAllData() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public boolean loginUser(RequestForLogin request) {

        Optional<User> userOpt = userRepository.findByEmail(request.getEmail());

        return userOpt.isPresent() &&
                userOpt.get().getPassword().equals(request.getPassword());
    }
}
