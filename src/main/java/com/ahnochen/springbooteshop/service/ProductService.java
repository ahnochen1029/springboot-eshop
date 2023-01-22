package com.ahnochen.springbooteshop.service;

import com.ahnochen.springbooteshop.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
}
