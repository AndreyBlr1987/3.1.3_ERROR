package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AdminRestController {

    private UserService userService ;
    @Autowired
    public AdminRestController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/users")
    public  List<User> allUsers(@AuthenticationPrincipal User user){
        return  userService.allUsers();


    }
}
