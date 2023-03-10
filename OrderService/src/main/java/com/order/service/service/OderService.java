package com.order.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.order.service.commom.Payment;
import com.order.service.dto.TransactionRequest;
import com.order.service.dto.TransationResponce;
import com.order.service.entity.Order;
import com.order.service.repositry.OderRepositry;

@Service
public class OderService {
	@Autowired
	private OderRepositry OderRepositry;
	@Autowired
	private RestTemplate restTemplate;

	public TransationResponce saveOrderService(TransactionRequest tRequest) {
		String resonce=" ";
		
	Order oder=	tRequest.getOrder();
	Payment payment=tRequest.getPayment();
	payment.setOderid(oder.getId());
	payment.setAmount(oder.getPrice());
	Payment PaymentResponce=restTemplate.postForObject("http://localhost:8081/paymentService/dopayment", payment, Payment.class);
	resonce=PaymentResponce.getPaymentStatus().equals("success")?"sucessefull":"failed" ;
	OderRepositry.save(oder);
		
		return  new TransationResponce(oder,PaymentResponce.getTransactionId(),PaymentResponce.getAmount(),resonce);
	}
}
