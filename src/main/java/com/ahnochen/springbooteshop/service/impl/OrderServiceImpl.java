package com.ahnochen.springbooteshop.service.impl;

import com.ahnochen.springbooteshop.dao.OrderDao;
import com.ahnochen.springbooteshop.dao.ProductDao;
import com.ahnochen.springbooteshop.dto.BuyItem;
import com.ahnochen.springbooteshop.dto.CreateOrderRequest;
import com.ahnochen.springbooteshop.model.Order;
import com.ahnochen.springbooteshop.model.OrderItem;
import com.ahnochen.springbooteshop.model.Product;
import com.ahnochen.springbooteshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @Override
    public Order getOrderById(Integer orderId) {
        Order order = orderDao.getOrderById(orderId);

        List<OrderItem> orderItemList = orderDao.getOrderItemsByOrderId(orderId);

        order.setOrderItemList(orderItemList);

        return order;
    }

    @Transactional
    @Override
    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest) {
        int totalAmount = 0;
        List<OrderItem> orderItemList = new ArrayList<>();
        for(BuyItem buyItem: createOrderRequest.getBuyItemList()){

            Product product = productDao.getProductById(buyItem.getProductId());

            // calc total amount
            int amount = product.getPrice()* buyItem.getQuantity();
            totalAmount += amount;

            // orderItemList
            OrderItem orderItem = new OrderItem();
            orderItem.setProductId(buyItem.getProductId());
            orderItem.setQuantity(buyItem.getQuantity());
            orderItem.setAmount(amount);

            orderItemList.add(orderItem);
        }

        Integer orderId = orderDao.createOrder(userId, totalAmount);

        orderDao.createOrderItems(orderId, orderItemList);

        return orderId;
    }
}
