package com.geekbrains.service;

import com.geekbrains.base.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product findById(int id);
    Product addProduct(Product product);
}
