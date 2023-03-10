package com.payment.service.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.service.entity.Payment;
import com.payment.service.service.PaymentService;



@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;

	@PostMapping("/dopayment")
	public ResponseEntity<Payment> savePayment(@RequestBody Payment payment) {
		System.out.println(payment.getPaymentStatus());
		return new ResponseEntity<Payment>(paymentService.doPayment(payment), HttpStatus.ACCEPTED);

	}

	 
}
