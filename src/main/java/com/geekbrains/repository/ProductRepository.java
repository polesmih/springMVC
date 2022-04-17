package com.geekbrains.repository;

import com.geekbrains.base.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAll();
    Product findById(int id);
    Product addProduct(Product product);
}
