package com.akash.webapp.Controller;

import com.akash.webapp.Model.Product;
import com.akash.webapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService service;
    @Autowired
    public ProductController(ProductService service){
        this.service = service;
    }
    @RequestMapping("/products")
   public List<Product> getProducts(){
        return service.getProducts();
    }
}
