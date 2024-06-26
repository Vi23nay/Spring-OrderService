package com.dailycodebuffer.OrderService.dtos;

import com.dailycodebuffer.OrderService.constants.PaymentMode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequest {
	private long productId;
	private long totalAmount;
	private long quantity;
	private PaymentMode paymentMode;
}
