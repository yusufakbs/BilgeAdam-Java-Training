package com.yusuf.controller;

import com.yusuf.entity.Product;
import com.yusuf.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
@CrossOrigin
public class ProductController {

    private final ProductService productService;

    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/find-all")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/find-by-id")
    public Optional<Product> findById(Integer id) {
        return productService.findById(id);
    }
}
