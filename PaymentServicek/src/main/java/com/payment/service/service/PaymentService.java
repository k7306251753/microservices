package com.payment.service.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.service.entity.Payment;
import com.payment.service.repositry.PaymentRepositry;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepositry paymentRepositry;
	public Payment doPayment(Payment payment) {
		payment.setPaymentStatus(paymentProcessing());
		
	//	payment.setPaymentStatus("sucess");
		
		payment.setTransactionId(UUID.randomUUID().toString());
		
		return paymentRepositry.save(payment);
	}
	public String paymentProcessing() {
		//3rd party payment gateway paypall,paytm
		return new Random().nextBoolean()?"success":"false";
	}
	
}
