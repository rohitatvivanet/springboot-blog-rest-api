package com.springboot.blog.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class PostController {

    @PostMapping("/api/v1/posts")
    public ResponseEntity<String> createPost(){
        return new ResponseEntity<>("Post Created", HttpStatus.CREATED);
    }

    @GetMapping("/api/v1/posts")
    public ResponseEntity<String> getAllPosts(){
        return new ResponseEntity<>("All Posts", HttpStatus.OK);
    }
}
