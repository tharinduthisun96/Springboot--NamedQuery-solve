package com.example.sample.repositories;

import com.example.sample.domains.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}
