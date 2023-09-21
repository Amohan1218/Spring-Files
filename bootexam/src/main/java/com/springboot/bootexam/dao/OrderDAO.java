package com.springboot.bootexam.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springboot.bootexam.model.OrderRowMapper;
import com.springboot.bootexam.model.Orders;

@Component
public class OrderDAO {

	private final JdbcTemplate jdbcTemplate;

	public OrderDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Orders> getAllOrders() {
		return jdbcTemplate.query("SELECT * FROM ms_exam_orders", new OrderRowMapper());
	}

	public boolean createOrder(Orders order) {
		return jdbcTemplate.update(
				"INSERT INTO ms_exam_orders (OrderID, CustomerID, OrderDate, ProductID, Quantity, UnitPrice, TotalAmount) VALUES(?, ?, ?, ?, ?, ?, ?)",
				order.getOrderId(), order.getCustomerId(), order.getOrderDate(), order.getProductId(),
				order.getQuantity(), order.getUnitPrice(), order.getTotalAmount()) > 0;
	}

	public boolean deleteOrder(int id) {
		return jdbcTemplate.update("delete from ms_exam_orders where OrderID = ?", id) > 0;
	}

	public boolean updateOrder(Orders order) {
		return jdbcTemplate.update(
				"UPDATE ms_exam_orders set CustomerID = ?, OrderDate = ?, ProductID  = ?, Quantity  = ?, UnitPrice = ?, TotalAmount = ? where OrderID = ?",
				order.getCustomerId(), order.getOrderDate(), order.getProductId(), order.getQuantity(),
				order.getUnitPrice(), order.getTotalAmount(), order.getOrderId()) > 0;
	}
}
