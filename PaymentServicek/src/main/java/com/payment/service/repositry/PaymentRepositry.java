package com.payment.service.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payment.service.entity.Payment;

public interface PaymentRepositry extends JpaRepository<Payment, Integer> {

}
