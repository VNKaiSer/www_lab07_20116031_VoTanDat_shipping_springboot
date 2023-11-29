package com.example.lab07_shop_online_springboot.backend.models;

import com.example.lab07_shop_online_springboot.backend.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "accounts")
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    private String username;
    private String password;
    private Role role;
}
