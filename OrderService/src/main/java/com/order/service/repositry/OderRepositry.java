package com.order.service.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.service.entity.Order;



public interface OderRepositry  extends JpaRepository<Order, Integer>{

	

}
