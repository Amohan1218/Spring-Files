package com.springboot.bootexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bootexam.model.Orders;
import com.springboot.bootexam.repository.OrdersRepository;

@RestController
public class OrderController {
	
	@Autowired
	OrdersRepository orobj;
	
	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	public List<Orders> getAllOrders(){
		return orobj.findAllOrders();
	}
	
	@RequestMapping(value = "/orders/{id}")
	public ResponseEntity<Object> getEmployeeByEmpNo(@PathVariable("id") int id) { 
		return new ResponseEntity<>(orobj.getOrderById(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/orders/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> delete(@PathVariable("id") int id) { 
		orobj.deleteOrder(id);
		return new ResponseEntity<>("Order is deleted successsfully", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/orders/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateOrder(@PathVariable("id") int id, @RequestBody Orders emp) { 
		orobj.updateOrder(emp);
		return new ResponseEntity<>("Order is updated successsfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/orders", method = RequestMethod.POST)
	public ResponseEntity<Object> createOrder(@RequestBody Orders emp) {
		orobj.addOrder(emp);
		return new ResponseEntity<>("Order is created successfully", HttpStatus.CREATED);
	}
}
