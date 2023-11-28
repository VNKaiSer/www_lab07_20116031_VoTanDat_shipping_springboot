package com.example.lab07_shop_online_springboot.backend.models;

import com.example.lab07_shop_online_springboot.backend.enums.EmployeeStatus;
import jakarta.persistence.*;
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
    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;

}
