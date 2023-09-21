package com.springboot.bootexam.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.bootexam.dao.OrderDAO;
import com.springboot.bootexam.model.Orders;

@Repository
public class OrderRepositoryImp implements OrdersRepository{

	@Autowired
	OrderDAO odao;

	public List<Orders> findAllOrders() {
		List<Orders> olist = odao.getAllOrders();
		return olist;
	}

	@Override
	public Orders getOrderById(int idNo) {
		for (Orders ord : odao.getAllOrders()) {
			if (ord.getOrderId() == idNo) {
				return ord;
			}
		}
		return null;
	}

	@Override
	public void addOrder(Orders order) {
		odao.createOrder(order);
	}

	@Override
	public void deleteOrder(int orderNo) {
		odao.deleteOrder(orderNo);
	}

	@Override
	public void updateOrder(Orders order) {
		odao.updateOrder(order);
	}

}
