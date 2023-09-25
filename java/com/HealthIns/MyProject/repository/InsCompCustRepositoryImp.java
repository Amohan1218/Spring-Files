package com.HealthIns.MyProject.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.HealthIns.MyProject.dao.InsCompCustDAO;
import com.HealthIns.MyProject.model.InsCompCustomer;

@Repository
public class InsCompCustRepositoryImp implements InsCompCustRepository{

	@Autowired
	InsCompCustDAO cdao;
	
	@Override
	public ArrayList<InsCompCustomer> getAllCustomers() {
		return cdao.getAllCustomers();
	}

	@Override
	public InsCompCustomer getCustomerId(int Id) {
		return cdao.getCustomerById(Id);
	}

	@Override
	public String updateStatus(int Id, String status) {
		return cdao.updateStatus(Id, status);
	}
}