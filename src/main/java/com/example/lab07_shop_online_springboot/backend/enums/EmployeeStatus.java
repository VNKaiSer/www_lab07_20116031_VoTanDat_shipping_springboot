package com.example.lab07_shop_online_springboot.backend.enums;

public enum EmployeeStatus {

    IN_JOB(1),
    RETIRED(0),
    LEAVED(-1);
    private int id;
    EmployeeStatus(int id){
        this.id = id;
    }

}
