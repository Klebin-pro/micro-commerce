package com.learning.microcommerce.dao;

import com.learning.microcommerce.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {
    List<Product> findByOrderByNameAsc();
}
