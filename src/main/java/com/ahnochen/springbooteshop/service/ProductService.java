package com.ahnochen.springbooteshop.service;

import com.ahnochen.springbooteshop.dto.ProductRequest;
import com.ahnochen.springbooteshop.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
