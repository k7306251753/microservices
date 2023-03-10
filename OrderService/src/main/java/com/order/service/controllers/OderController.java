package com.order.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.service.dto.TransactionRequest;
import com.order.service.dto.TransationResponce;
import com.order.service.service.OderService;



@RestController
@RequestMapping("/order")
public class OderController {
	@Autowired
	private OderService OrderService;
@PostMapping("/bookOrder")
public ResponseEntity<TransationResponce>saveOder(@RequestBody TransactionRequest tRequest){

	return new ResponseEntity<TransationResponce>(OrderService.saveOrderService(tRequest),HttpStatus.ACCEPTED);
	
}
}
