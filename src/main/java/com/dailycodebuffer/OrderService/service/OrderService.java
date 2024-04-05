package com.dailycodebuffer.OrderService.service;

import com.dailycodebuffer.OrderService.dtos.OrderRequest;

public interface OrderService {

	long placeOrder(OrderRequest orderRequest);

}
