package com.springboot.bootexam.model;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderRowMapper implements RowMapper<Orders> {

    @Override
    public Orders mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Orders order = new Orders();
        
        order.setOrderId(resultSet.getInt("OrderID"));
        order.setCustomerId(resultSet.getString("CustomerID"));
        order.setOrderDate(resultSet.getString("OrderDate"));
        order.setProductId(resultSet.getString("ProductID"));
        order.setQuantity(resultSet.getInt("Quantity"));
        order.setUnitPrice(resultSet.getDouble("UnitPrice"));
        order.setTotalAmount(resultSet.getDouble("TotalAmount"));
        
        return order;
    }
}
