package com.ec.springboot.restfulWebServices.controllers;

import com.ec.springboot.restfulWebServices.exceptions.ProductNotFound;
import com.ec.springboot.restfulWebServices.pojos.Product;
import com.ec.springboot.restfulWebServices.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class RestApis {

    @Autowired
    private ProductService productService;

    @RequestMapping("/all")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @RequestMapping("/{id}")
    public ResponseEntity<Product> getProducts(@PathVariable Integer id) {
        Product product = productService.getProduct(id);
        if(product == null) {
            throw new ProductNotFound("Product not found");
        } else {
            return ResponseEntity.ok(product);
        }
    }

}
