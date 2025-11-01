package com.akash.webapp.service;

import com.akash.webapp.Model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> product = new ArrayList<>(
            Arrays.asList(new Product(101,"apple",50000),
                    new Product(102,"mingos",40000)));
    public List<Product> getProducts(){
        return product;
    }
    public Product getProductId(int prodId){
        return  product.stream().filter(n -> n.getProdId() == prodId)
                .findFirst().orElse(new Product(1,"No Item",0));
    }

    public void addProd(Product prod){
        product.add(prod);
    }

    public void updateProd(Product prod){
        int index = 0;
        for(int i=0;i<product.size();i++){
            if(product.get(i).getProdId() == prod.getProdId()){
                index = i;
            }
        }
        product.set(index,prod);
    }

    public void deleteProd(int prodId){
        int index = 0;
        for(int i=0;i<product.size();i++){
            if(product.get(i).getProdId() == prodId){
                index = i;
            }
        }
        product.remove(index);

    }
}
