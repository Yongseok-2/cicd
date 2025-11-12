package com.example.docker.service;
import org.springframework.stereotype.Service;

import com.example.docker.entity.Post;
import com.example.docker.repository.PostRepository;

import java.util.List;

@Service
public class PostService {
    private final PostRepository repo;
    public PostService(PostRepository repo) { this.repo = repo; }
    public List<Post> list() { return repo.findAll(); }
    public Post save(Post post) { return repo.save(post); }
    public Post get(Long id) { return repo.findById(id).orElse(null); }
    public void delete(Long id) { repo.deleteById(id); }
}