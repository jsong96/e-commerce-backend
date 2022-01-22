package com.jws.ecommerce.dto;


import com.jws.ecommerce.entity.Address;
import com.jws.ecommerce.entity.Customer;
import com.jws.ecommerce.entity.Order;
import com.jws.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
