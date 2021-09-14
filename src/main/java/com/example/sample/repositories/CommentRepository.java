package com.example.sample.repositories;

import com.example.sample.domains.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
