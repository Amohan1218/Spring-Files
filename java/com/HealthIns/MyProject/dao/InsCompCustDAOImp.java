package com.HealthIns.MyProject.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.HealthIns.MyProject.RowMapper.InsCompCustRowMapper;
import com.HealthIns.MyProject.model.InsCompCustomer;

@Component
public class InsCompCustDAOImp implements InsCompCustDAO{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public ArrayList<InsCompCustomer> getAllCustomers() {
		String stmt = "SELECT * FROM Customers";
		return (ArrayList<InsCompCustomer>) jdbcTemplate.query(stmt, new InsCompCustRowMapper());
	}

	@Override
	public InsCompCustomer getCustomerById(int id) {
		String stmt = "SELECT * FROM Customers WHERE cust_id = ?";
		return jdbcTemplate.queryForObject(stmt, new InsCompCustRowMapper(), new Object[]{id});
	}

	@Override
	public String updateStatus(int id, String status) {
		String sql = "UPDATE Customers SET cust_status = ? WHERE cust_id = ?";
        try {
            int rowsUpdated = jdbcTemplate.update(sql, status, id);
            if (rowsUpdated > 0) {
                return "Status Updated Successfully..!!";
            } else {
                return "No disease found with the provided ID.";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to update disease: " + e.getMessage();
        }
	}
}
