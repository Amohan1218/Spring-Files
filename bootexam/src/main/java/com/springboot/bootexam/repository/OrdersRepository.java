package com.springboot.bootexam.repository;

import java.util.List;

import com.springboot.bootexam.model.Orders;

public interface OrdersRepository {
	
	List<Orders> findAllOrders();
	
	public Orders getOrderById(int idNo);
	
	public void addOrder(Orders order);
	
	public void deleteOrder(int orderNo);
	
	public void updateOrder(Orders order);
}
