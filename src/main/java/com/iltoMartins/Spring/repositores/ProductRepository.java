package com.iltoMartins.Spring.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iltoMartins.Spring.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}