package com.example.testdrivendevelopment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.testdrivendevelopment.model.Product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @GetMapping
    public ResponseEntity<List<Product>> getAll(){        
        List<Product> products = new ArrayList<Product>();
        
        return new ResponseEntity<>(products, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Optional<Product>> getById(@PathVariable Integer id){        
        Optional<Product> product = Optional.of(new Product());
        
        return new ResponseEntity<>(product, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product){              
        
        return new ResponseEntity<>(product,HttpStatus.OK);
    }
    
}
