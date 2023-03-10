package com.ahnochen.springbooteshop.dao;

import com.ahnochen.springbooteshop.dto.OrderQueryParams;
import com.ahnochen.springbooteshop.model.Order;
import com.ahnochen.springbooteshop.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);

}
