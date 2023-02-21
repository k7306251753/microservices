package com.order.service.commom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class Payment {

	private int paymentId ;
	private String PaymentStatus;
	private String transactionId;
	private int oderid;
	private double amount;

}
