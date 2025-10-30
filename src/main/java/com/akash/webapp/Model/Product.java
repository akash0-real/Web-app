package com.akash.webapp.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class Product {
    private int prodId;
    private String prodName;
    private int price;

}
