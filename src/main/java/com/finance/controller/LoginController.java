package com.finance.controller;


import com.finance.dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoginController {

    @PostMapping
    public User createUser(@RequestBody User newUser) {
        // Save the user to the database here
        return newUser;
    }
}