package com.example.sample.controllers;

import com.example.sample.domains.Comment;
import com.example.sample.services.CommentService;
import com.example.sample.services.PostService;
import com.example.sample.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private UserService userService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private PostService postService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Comment createComment(){
        return commentService.create();
    }

    @GetMapping
    public @ResponseBody Comment get(){
        return commentService.get();
    }

}
