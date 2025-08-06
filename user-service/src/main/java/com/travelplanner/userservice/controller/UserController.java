package com.travelplanner.userservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/users/")
public class UserController {
    
    @GetMapping("create")
    public String createUser() {
        return new String("Creating user");
    }
    
}
