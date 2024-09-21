package com.iltoMartins.Spring.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iltoMartins.Spring.entities.OrderItem;
import com.iltoMartins.Spring.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}