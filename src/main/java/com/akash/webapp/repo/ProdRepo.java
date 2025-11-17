package com.akash.webapp.repo;

import com.akash.webapp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdRepo  extends JpaRepository<Product,Integer> {


}
