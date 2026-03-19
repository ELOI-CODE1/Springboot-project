package com.elocode.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.elocode.h2.repository.ProductRepository;
import com.elocode.h2.Entity.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public String getProducts(Model model){
        List<Product>products=productRepository.findAll();
        model.addAttribute("products",products);
        return "products";
    }

    @GetMapping("/products/new")
    public String showForm(Model model){
        model.addAttribute("product",new Product());
        return"product-form";
    }

    @PostMapping("/products/new")
    public String saveProduct(@ModelAttribute Product product){
        productRepository.save(product);
        return"redirect:/products";
    }
    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){
        productRepository.deleteById(id);
        return "redirect:/products";
    }
    
}
