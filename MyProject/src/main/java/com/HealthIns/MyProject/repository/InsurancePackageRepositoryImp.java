package com.HealthIns.MyProject.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.HealthIns.MyProject.dao.InsurancePackageDAO;
import com.HealthIns.MyProject.model.InsurancePackage;

@Repository
public class InsurancePackageRepositoryImp implements InsurancePackageRepository{
	
	@Autowired
	InsurancePackageDAO ipdao;
	
	@Override
	public List<InsurancePackage> getAllPackagesList() {
		return ipdao.getAllPackages();
	}

}
