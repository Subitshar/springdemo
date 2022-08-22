package com.samples.S05InterfaceInjection.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.samples.S05InterfaceInjection.DAO.OrderDAO;
import com.samples.S05InterfaceInjection.Service.OrderService;
@Component("service")
public class OrderServiceImpl implements OrderService {
	@Autowired()
	@Qualifier("DB2")
	private OrderDAO orderDAO;

	public OrderDAO getOrderDAO() {
		return orderDAO;
	}

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	@Override
	public void placeOrder() {
		System.out.println("Inside OrderServiceImpl.placeOrder() method...");
		orderDAO.createOrder();
	}

}