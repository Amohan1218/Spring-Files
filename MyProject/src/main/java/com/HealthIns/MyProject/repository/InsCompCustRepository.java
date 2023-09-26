package com.HealthIns.MyProject.repository;

import java.util.ArrayList;

import com.HealthIns.MyProject.model.InsCompCustomer;
import com.HealthIns.MyProject.model.InsCompPolicy;

public interface InsCompCustRepository {
	ArrayList<InsCompCustomer> getAllCustomers();

	InsCompCustomer getCustomerId(int Id);

	String updateStatus(int Id, String status);

	ArrayList<InsCompPolicy> getPolicies(String id);
}
