package com.example.sample.services.base;

import com.example.sample.domains.Comment;
import com.example.sample.domains.Post;
import com.example.sample.domains.User;
import com.example.sample.repositories.CommentRepository;
import com.example.sample.repositories.PostRepository;
import com.example.sample.repositories.UserRepository;
import com.example.sample.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    public Comment create(){
        User user = userRepository.findById("a9a4e27e-4c14-4613-ab70-f6d55564614a").get();
        Integer id = 3;
        Post post =  postRepository.findById(id).get();

        Comment comment = new Comment();
        comment.setMessage("Sample Comment 1");
        comment.setPost(post);
        comment.setUser(user);

        commentRepository.save(comment);
        return comment;
    }

    @Override
    public Comment get() {
        return commentRepository.findById(6).get();
    }
}
