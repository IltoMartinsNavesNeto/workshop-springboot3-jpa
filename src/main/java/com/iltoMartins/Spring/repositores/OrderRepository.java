package com.iltoMartins.Spring.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iltoMartins.Spring.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}