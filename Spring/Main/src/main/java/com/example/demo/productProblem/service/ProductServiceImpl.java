package com.example.demo.productProblem.service;

import com.example.demo.productProblem.entity.Product;
import com.example.demo.productProblem.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    final private ProductRepository productRepository;

    @Override
    public List<Product> list() {
        return productRepository.findAll(Sort.by(Sort.Direction.DESC, "boardId"));
    }

    @Override
    public Product register(Product product) {
        return productRepository.save(product);
    }
}
