package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Красное солнце", 40));
        posts.add(new Post("Белое солнце", 401));
        posts.add(new Post("Зумерское солнце", 540));
        return posts;
    }
}
