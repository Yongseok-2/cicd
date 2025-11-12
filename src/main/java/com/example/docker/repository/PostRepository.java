package com.example.docker.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.docker.entity.Post;
public interface PostRepository extends JpaRepository<Post, Long> {}