package com.akash.webapp.service;

import com.akash.webapp.Model.Product;
import com.akash.webapp.repo.ProdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProdRepo repo;
    @Autowired
    ProductService(ProdRepo repo){
        this.repo = repo;
    }


    public List<Product> getProducts(){
        return repo.findAll() ;
    }
    public Product getProductId(int prodId){
        return  repo.findById(prodId).orElse(new Product());
    }

    public void addProd(Product prod){
        repo.save(prod);
    }

    public void updateProd(Product prod){
        repo.save(prod);
    }

    public void deleteProd(int prodId){
        repo.deleteById(prodId);

    }
}
