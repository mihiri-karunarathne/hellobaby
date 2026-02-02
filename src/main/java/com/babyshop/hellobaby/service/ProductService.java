package com.babyshop.hellobaby.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.babyshop.hellobaby.model.Product;
import com.babyshop.hellobaby.repository.ProductRepository;
@Service
public class ProductService {
   private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // CREATE / UPDATE
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // READ ALL
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // READ ONE
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    // DELETE
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    } 
}
