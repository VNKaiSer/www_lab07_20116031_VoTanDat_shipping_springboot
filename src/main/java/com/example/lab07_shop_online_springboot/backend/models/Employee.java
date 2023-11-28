package com.example.lab07_shop_online_springboot.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "emp_id")
    private long id;
    @Column(name = "emp_name")
    private String name;
    private LocalDate dob;
    private String email;
    private String phone;
    private String address;


}
