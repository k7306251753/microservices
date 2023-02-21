package com.order.service.dto;


import com.order.service.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class TransationResponce {
	private Order order;
	private String  transationId;
	private double amount;
	private String message;
}
