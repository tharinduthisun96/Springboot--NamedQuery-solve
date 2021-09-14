package com.example.sample.controllers;

import com.example.sample.domains.Post;
import com.example.sample.services.PostService;
import com.example.sample.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Post createPost(){
        return postService.create();
    }

    @GetMapping
    public @ResponseBody Post getPost(){
        return postService.get();
    }

}
