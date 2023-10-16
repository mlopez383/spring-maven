package com.unosquare.operacionesapi.controller;

import com.unosquare.operacionesapi.entity.Product;
import com.unosquare.operacionesapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {
  @Autowired
  private ProductService productService;

  @PostMapping
  public Product addProduct(@RequestBody Product product) {
    return productService.addProduct(product);
  }

  @GetMapping("{id}")
  public ResponseEntity<Product> getProductById(@PathVariable("id") Long productId) {
    Product product = productService.getProductById(productId);
    return ResponseEntity.ok(product);
  }
}
