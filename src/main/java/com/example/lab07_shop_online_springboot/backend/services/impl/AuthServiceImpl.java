package com.example.lab07_shop_online_springboot.backend.services.impl;

import com.example.lab07_shop_online_springboot.backend.services.AuthService;
import com.example.lab07_shop_online_springboot.backend.models.Account;
import com.example.lab07_shop_online_springboot.backend.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired private AuthRepository authRepository;
    @Override
    public UserDetails loadUserByUsername(String username) {
        Account user = authRepository.findById(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                List.of(new SimpleGrantedAuthority(user.getRole().toString()))
        );
    }
}
