package com.management.Library_Management.Controller;

import com.management.Library_Management.entities.User;
import com.management.Library_Management.requests.RequestForLogin;
import com.management.Library_Management.requests.RequestForRegistration;
import com.management.Library_Management.service.RegisterInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registration")
@CrossOrigin(origins = "http://localhost:5173")
public class UserProfileController {

    @Autowired
    private RegisterInterface registerInterface;

    // REGISTER
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(
            @RequestBody RequestForRegistration request) {

        registerInterface.addUser(request);
        return ResponseEntity.ok("User registered successfully");
    }

    // GET ALL USERS
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(registerInterface.getAllData());
    }

    // GET USER BY ID
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = registerInterface.getUserById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return ResponseEntity.ok(user);
    }

    // LOGIN
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(
            @RequestBody RequestForLogin request) {

        boolean success = registerInterface.loginUser(request);
        if (success) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401)
                    .body("Invalid email or password");
        }
    }
}
