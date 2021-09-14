package com.example.sample.controllers;

import com.example.sample.domains.User;
import com.example.sample.dtos.UserNameDto;
import com.example.sample.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody User createUser(){
        return userService.create();
    }

    @GetMapping
    public @ResponseBody UserNameDto get(){
        return userService.get();
    }

}
