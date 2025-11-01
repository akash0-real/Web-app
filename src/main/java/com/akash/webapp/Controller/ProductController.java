package com.akash.webapp.Controller;

import com.akash.webapp.Model.Product;
import com.akash.webapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService service;
    private final Product product;

    @Autowired
    public ProductController(ProductService service, Product product){
        this.service = service;
        this.product = product;
    }
    @GetMapping("/products")
   public List<Product> getProducts(){
        return service.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductId(prodId);
    }

    @PostMapping("/products")
    public void addProd(@RequestBody Product prod){
        service.addProd(prod);
    }

    @PutMapping("/products")
    public void updateProd(@RequestBody Product prod){
        service.updateProd(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProd(@PathVariable int prodId){
        service.deleteProd(prodId);
    }
}
