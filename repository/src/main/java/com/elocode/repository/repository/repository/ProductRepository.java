package com.elocode.repository.repository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.elocode.repository.repository.model.Product;

public interface ProductRepository extends JpaRepository<Product,String>{

}
