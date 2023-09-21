package com.springboot.bootexam.model;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Products> {

    @Override
    public Products mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Products product = new Products();
        product.setProductId(resultSet.getString("ProductID"));
        product.setProductName(resultSet.getString("ProductName"));
        product.setCategory(resultSet.getString("Category"));
        product.setDescription(resultSet.getString("Description"));
        product.setUnitPrice(resultSet.getDouble("UnitPrice"));
        product.setStockQuantity(resultSet.getInt("StockQuantity"));
        product.setSupplierId(resultSet.getString("SupplierID"));
        return product;
    }
}
