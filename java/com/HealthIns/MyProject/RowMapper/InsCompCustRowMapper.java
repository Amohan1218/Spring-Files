package com.HealthIns.MyProject.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.HealthIns.MyProject.model.InsCompCustomer;

public class InsCompCustRowMapper implements RowMapper<InsCompCustomer> {

    @Override
    public InsCompCustomer mapRow(ResultSet rs, int rowNum) throws SQLException {
    	InsCompCustomer customer = new InsCompCustomer();
        customer.setCustId(rs.getInt("cust_id"));
        customer.setCustFName(rs.getString("cust_fname"));
        customer.setCustLName(rs.getString("cust_lname"));
        customer.setCustDob(rs.getDate("cust_dob"));
        customer.setCustAddress(rs.getString("cust_address"));
        customer.setCustGender(rs.getString("cust_gender").charAt(0));
        customer.setCustCDate(rs.getDate("cust_cdate"));
        customer.setCustAadhar(rs.getLong("cust_aadhar"));
        customer.setCustStatus(rs.getString("cust_status"));
        customer.setCustLuUDate(rs.getDate("cust_luudate"));
        customer.setCustLuUser(rs.getInt("cust_luuser"));

        return customer;
    }
}