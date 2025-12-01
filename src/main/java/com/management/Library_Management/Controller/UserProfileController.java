package com.management.Library_Management.Controller;

import com.management.Library_Management.entities.User;
import com.management.Library_Management.requests.RequestForLogin;
import com.management.Library_Management.requests.RequestForRegistration;
import com.management.Library_Management.service.RegisterInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping("/registration")
public class UserProfileController {

    @Autowired
    private RegisterInterface registerInterface;

    @PostMapping("/register")
    public String adduser(@RequestBody RequestForRegistration requestForRegistration){
        registerInterface.addUser(requestForRegistration);
        return "";
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllData(){
        return registerInterface.getAllData();
    }

    @GetMapping("/getUserById/{id}")
    public Optional<User> getUserById(@PathVariable String id){
        return registerInterface.getUserById(id);
    }

    @GetMapping("/getUserByEmailId")
    public User getUserByEmailId(@RequestParam String emailId){
        return registerInterface.getUserByEmailId(emailId);
    }


    @PostMapping("/login")
    public String userdetail(@RequestBody RequestForLogin requestforlogin){
        registerInterface.loginUser(requestforlogin);
        return "";
    }
}
