package com.springboot.blog.entity;

import lombok.Data;

@Data
public class User {
    private long id;
    private String name;
    private String username;
    private String email;
    private String password;
}
