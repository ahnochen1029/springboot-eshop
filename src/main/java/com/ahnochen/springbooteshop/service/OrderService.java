package com.ahnochen.springbooteshop.service;

import com.ahnochen.springbooteshop.dto.CreateOrderRequest;
import com.ahnochen.springbooteshop.model.Order;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
