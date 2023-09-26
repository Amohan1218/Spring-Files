package com.HealthIns.MyProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HealthIns.MyProject.model.InsurancePackage;
import com.HealthIns.MyProject.repository.InsurancePackageRepository;

@RestController
public class InsurancePackageController {
	
	@Autowired
	InsurancePackageRepository ipr;
	
	@GetMapping(value = "/getAllPackages")
	public List<InsurancePackage> getAllPackages(){
		return ipr.getAllPackagesList();
	}
}
