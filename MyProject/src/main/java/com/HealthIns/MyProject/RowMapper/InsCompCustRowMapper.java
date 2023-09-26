package com.HealthIns.MyProject.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.HealthIns.MyProject.model.InsCompCustomer;

public class InsCompCustRowMapper implements RowMapper<InsCompCustomer> {

    @Override
    public InsCompCustomer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
    	InsCompCustomer customer = new InsCompCustomer();
    	customer.setCustId(resultSet.getInt("cust_id"));
        customer.setCustFName(resultSet.getString("cust_fname"));
        customer.setCustLName(resultSet.getString("cust_lname"));
        customer.setCustDob(resultSet.getDate("cust_dob"));
        customer.setCustAddress(resultSet.getString("cust_address"));
        customer.setCustGender(resultSet.getString("cust_gender").charAt(0));
        customer.setCustCDate(resultSet.getDate("cust_cdate"));
        customer.setCustUserId(resultSet.getInt("cust_user_id"));
        customer.setCustAadhar(resultSet.getLong("cust_aadhar"));
        customer.setCustStatus(resultSet.getString("cust_status"));
        customer.setCustLuUDate(resultSet.getDate("cust_luudate"));
        customer.setCustLuUser(resultSet.getInt("cust_luuser"));

        return customer;
    }
}