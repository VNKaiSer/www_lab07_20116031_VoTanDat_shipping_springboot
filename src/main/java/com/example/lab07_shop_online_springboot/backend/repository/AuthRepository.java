package com.example.lab07_shop_online_springboot.backend.repository;

import com.example.lab07_shop_online_springboot.backend.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository  extends JpaRepository<Account, String> {
}
