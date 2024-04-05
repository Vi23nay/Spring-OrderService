package com.dailycodebuffer.OrderService.service;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.OrderService.dtos.OrderRequest;
import com.dailycodebuffer.OrderService.entities.Order;
import com.dailycodebuffer.OrderService.repository.OrderRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;
	
	public long placeOrder(OrderRequest orderRequest) {
		
		//Order Entity -> Save the data with status order created
        //Product Service -> Block products(Reduce the quantity)
		//Payment Service -> Payments -> Success -> COMPLETE/CANCELLED
		
		log.info("Placing Order Request : {}", orderRequest);
		
		Order order = Order.builder()
							.amount(orderRequest.getTotalAmount())
							.orderStatus("CREATED")
							.productId(orderRequest.getProductId())
							.orderDate(Instant.now())
							.quantity(orderRequest.getQuantity())
						    .build();
		
		order = orderRepository.save(order);
		log.info("Order placed successfully with Order Id : {}", order.getId());
		return order.getId();
	}
}
