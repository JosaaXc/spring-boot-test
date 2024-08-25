package com.java.products.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.java.products.models.Product;
import com.java.products.repositories.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/products") // Indica que todas las rutas de este controlador empiezan con /products
public class ProductController {

    private final ProductRepository productRepository;
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // @GetMapping
    // public String getAllProducts() {
    //     return new String();
    // }


    // @GetMapping("/{id}")
    // public String getProduct(@RequestParam String param) {
    //     return new String();
    // }

    @PostMapping
    public Product createProduct(@RequestBody Product producto) {
        return productRepository.save(producto);
    }
    
    

}
