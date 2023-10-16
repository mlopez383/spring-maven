package com.unosquare.operacionesapi.service;

import com.unosquare.operacionesapi.entity.Product;
import com.unosquare.operacionesapi.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class ProductService {
  @Autowired
  private ProductRepository productRepository;

  @Transactional
  public Product addProduct(Product product) {
    return productRepository.save(product);
  }

  public Product getProductById(Long productId) {
    return productRepository.findById(productId).get();
  }
}
