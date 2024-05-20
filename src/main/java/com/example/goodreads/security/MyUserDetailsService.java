package com.example.goodreads.security;

import com.example.goodreads.dao.entities.User;
import com.example.goodreads.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserManager userManager;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userManager.getUserByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("User not found");
        }
        else {
            List<GrantedAuthority> authorities = new ArrayList<>();
            GrantedAuthority authority = new SimpleGrantedAuthority(user.getRole().toString());
            authorities.add(authority);
            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
        }

    }
}
