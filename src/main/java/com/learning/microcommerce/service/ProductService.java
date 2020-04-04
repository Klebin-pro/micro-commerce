package com.learning.microcommerce.service;

import com.learning.microcommerce.Product;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ProductService {

    @javax.validation.Valid Product add(Product product);
    List<Product> getAll();

    List<Product> getAllOrderByNameAsc();

    Optional<Product> getById(int id);

    Map<String, Float> calculateProfit();
}
