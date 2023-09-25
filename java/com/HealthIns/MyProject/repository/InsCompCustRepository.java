package com.HealthIns.MyProject.repository;

import java.util.ArrayList;

import com.HealthIns.MyProject.model.InsCompCustomer;

public interface InsCompCustRepository {
	ArrayList<InsCompCustomer> getAllCustomers();

	InsCompCustomer getCustomerId(int Id);

	String updateStatus(int Id, String status);
}
