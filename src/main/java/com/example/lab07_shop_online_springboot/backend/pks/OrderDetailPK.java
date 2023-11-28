package com.example.lab07_shop_online_springboot.backend.pks;

import com.example.lab07_shop_online_springboot.backend.models.Order;
import com.example.lab07_shop_online_springboot.backend.models.Product;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@EqualsAndHashCode
@NoArgsConstructor
@Embeddable
public class OrderDetailPK implements Serializable {
    private long product;
    private long order;
}
