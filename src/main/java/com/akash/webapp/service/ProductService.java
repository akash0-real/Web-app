package com.akash.webapp.service;

import com.akash.webapp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> product = Arrays.asList(new Product(101,"apple",50000), new Product(102,"mingos",40000));
    public List<Product> getProducts(){
        return null;
    }
}
