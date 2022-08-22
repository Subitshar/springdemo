package com.samples.S05InterfaceInjection.DAO.impl;

import org.springframework.stereotype.Component;

import com.samples.S05InterfaceInjection.DAO.OrderDAO;

@Component("DB2")
public class OrderDAOImplSQL implements OrderDAO{

	@Override
	public void createOrder() {
		System.out.println("Create order in my SQL order");
		
	}

}
