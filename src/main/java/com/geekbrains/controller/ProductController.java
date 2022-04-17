package com.geekbrains.controller;

import com.geekbrains.base.Product;
import com.geekbrains.repository.ProductRepository;
import com.geekbrains.repository.impl.ProductRepositoryImpl;
import com.geekbrains.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    @GetMapping("/add-product")
    private String addFormAddProduct(Model model){
        Product product = new Product();
        model.addAttribute("products", product);
        return "addProduct";
    }

    @PostMapping("/add-product")
    private String addProduct(@ModelAttribute Product product){
        productService.addProduct(product);
        return "redirect:/product";
    }

    @GetMapping
    private String getAllProduct(Model model){
        List<Product> products = productService.getAll();
        model.addAttribute("products", products);
        return "product";

    }


}
