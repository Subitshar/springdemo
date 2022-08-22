package com.samples.S05InterfaceInjection.DAO.impl;

import org.springframework.stereotype.Component;

import com.samples.S05InterfaceInjection.DAO.OrderDAO;

@Component("DB1")
public class OrderDAOImpl implements OrderDAO{

	@Override
	public void createOrder() {
		System.out.println("Create the Oracle database");
	}

}