package com.example.lab07_shop_online_springboot.backend.enums;

public enum ProductStatus {
    ACTIVE(1),
    PAUSED(0),
    DE_ACTIVATED(-1);
    private int id;
    ProductStatus(int id){
        this.id = id;
    }
}
