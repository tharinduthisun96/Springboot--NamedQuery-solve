package com.example.sample.services.base;

import com.example.sample.domains.Post;
import com.example.sample.domains.User;
import com.example.sample.repositories.PostRepository;
import com.example.sample.repositories.UserRepository;
import com.example.sample.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceIml implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    public Post create(){
        Post post = new Post();
        post.setPost_message("Sample Message 6");

        User user = userRepository.findById("308b16a0-d0eb-467b-9d76-10c47635b15d").get();

        post.setUser(user);

        Post new_post = postRepository.save(post);
        return new_post;

    }

    public Post get(){
        return postRepository.findById(4).get();
    }
}
