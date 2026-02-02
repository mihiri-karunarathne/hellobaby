package com.babyshop.hellobaby.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.babyshop.hellobaby.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
