package com.ahnochen.springbooteshop.dao;

import com.ahnochen.springbooteshop.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}