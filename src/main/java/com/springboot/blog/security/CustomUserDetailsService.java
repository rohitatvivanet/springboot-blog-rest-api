package com.springboot.blog.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
        return new org.springframework.security.core.userdetails.User("rohitatvivanet@gmail.com",
                "$2a$10$KJarOnGiwC3GrnJraPaqdui.ZTGhk4Msp1E7w7YPzadibIts8/ivy", mapRolesToAuthorities(new ArrayList<>()));
    }

    private Collection< ? extends GrantedAuthority> mapRolesToAuthorities(List<String> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role)).collect(Collectors.toList());
    }
}
