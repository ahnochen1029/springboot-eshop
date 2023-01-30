package com.ahnochen.springbooteshop.service;

import com.ahnochen.springbooteshop.dto.CreateOrderRequest;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
