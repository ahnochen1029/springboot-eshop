package com.ahnochen.springbooteshop.controller;

import com.ahnochen.springbooteshop.dto.CreateOrderRequest;
import com.ahnochen.springbooteshop.model.Order;
import com.ahnochen.springbooteshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/users/{userId}/orders")
    public ResponseEntity<Order> createOrder (@PathVariable Integer userId,
                                          @RequestBody @Valid CreateOrderRequest createOrderRequest) {
        Integer orderId = orderService.createOrder(userId,createOrderRequest);

        Order order = orderService.getOrderById(orderId);

        return ResponseEntity.status(HttpStatus.OK).body(order);

    }
}
