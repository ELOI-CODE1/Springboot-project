package com.elocode.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.elocode.h2.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
