package com.HealthIns.MyProject.dao;

import java.util.ArrayList;

import com.HealthIns.MyProject.model.InsCompCustomer;
import com.HealthIns.MyProject.model.InsCompPolicy;

public interface InsCompCustDAO {
	ArrayList<InsCompCustomer> getAllCustomers();

	InsCompCustomer getCustomerById(int id);

	String updateStatus(int id, String status);

	ArrayList<InsCompPolicy> getPolicies(String id);
}
