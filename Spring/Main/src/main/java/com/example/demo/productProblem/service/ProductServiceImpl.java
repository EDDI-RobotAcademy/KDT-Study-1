package com.example.demo.productProblem.service;

import com.example.demo.productProblem.controller.form.RequestProductModifyForm;
import com.example.demo.productProblem.entity.Product;
import com.example.demo.productProblem.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Product view(Long productId) {
        Optional<Product> maybeProduct = productRepository.findById(productId);

        if (maybeProduct.isEmpty()) {
            log.info("해당 상품이 없습니다");
            return null;
        }
        return maybeProduct.get();
    }

    @Override
    public void delete(Long productId) {
        Optional<Product> maybeProduct = productRepository.findById(productId);

        if (maybeProduct.isEmpty()) {
            log.info("해당 상품이 없습니다");
        }
        productRepository.deleteById(productId);
    }

    @Override
    public Product modify(RequestProductModifyForm requestProductModifyForm, Long productId) {
        Optional<Product> maybeProduct = productRepository.findById(productId);

        if (maybeProduct.isEmpty()) {
            log.info("해당 상품이 없습니다");
        }

        Product product = maybeProduct.get();
        product.setName(requestProductModifyForm.getName());
        product.setPrice(requestProductModifyForm.getPrice());
        product.setExpireDate(requestProductModifyForm.getExpireDate());

        return productRepository.save(product);
    }
}
