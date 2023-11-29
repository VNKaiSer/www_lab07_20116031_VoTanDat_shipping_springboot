package com.example.lab07_shop_online_springboot.backend.services;
import org.springframework.security.core.userdetails.UserDetails;

public interface AuthService {
    UserDetails loadUserByUsername(String username);
}
