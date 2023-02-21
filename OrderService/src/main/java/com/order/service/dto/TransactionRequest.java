package com.order.service.dto;



import com.order.service.commom.Payment;
import com.order.service.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class TransactionRequest {
	private Order order;
	private Payment payment; 

}
