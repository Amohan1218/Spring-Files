package com.HealthIns.MyProject.dao;

import java.util.ArrayList;

import com.HealthIns.MyProject.model.InsCompCustomer;

public interface InsCompCustDAO {
	ArrayList<InsCompCustomer> getAllCustomers();

	InsCompCustomer getCustomerById(int id);

	String updateStatus(int id, String status);
}
