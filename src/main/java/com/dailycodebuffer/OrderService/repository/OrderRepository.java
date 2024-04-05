package com.dailycodebuffer.OrderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.OrderService.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
