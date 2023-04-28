package com.example.demo.productProblem.service;

import com.example.demo.productProblem.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> list();

    Product register(Product product);

    Product view(Long productId);

    void delete(Long productId);
}
