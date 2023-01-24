package com.ahnochen.springbooteshop.service;

import com.ahnochen.springbooteshop.constant.ProductCategory;
import com.ahnochen.springbooteshop.dto.ProductQueryParams;
import com.ahnochen.springbooteshop.dto.ProductRequest;
import com.ahnochen.springbooteshop.model.Product;

import java.util.List;

public interface ProductService {

    List<Product>getProducts(ProductQueryParams productQueryParams);

    Integer countProduct(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
