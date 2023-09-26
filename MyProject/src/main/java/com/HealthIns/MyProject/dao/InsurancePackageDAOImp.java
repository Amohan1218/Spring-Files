package com.HealthIns.MyProject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.HealthIns.MyProject.RowMapper.InsurancePackageRowMapper;
import com.HealthIns.MyProject.model.InsurancePackage;

@Component
public class InsurancePackageDAOImp implements InsurancePackageDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<InsurancePackage> getAllPackages() {
		String stmt = "SELECT * FROM InsurancePackages";
		return jdbcTemplate.query(stmt, new InsurancePackageRowMapper());
	}

}
