package com.HealthIns.MyProject.RowMapper;

import org.springframework.jdbc.core.RowMapper;

import com.HealthIns.MyProject.model.InsurancePackage;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InsurancePackageRowMapper implements RowMapper<InsurancePackage> {
    @Override
    public InsurancePackage mapRow(ResultSet rs, int rowNum) throws SQLException {
        InsurancePackage insurancePackage = new InsurancePackage();

        insurancePackage.setInspId(rs.getInt("insp_id"));
        insurancePackage.setInspTitle(rs.getString("insp_title"));
        insurancePackage.setInspDesc(rs.getString("insp_desc"));
        insurancePackage.setInspStatus(rs.getString("insp_status"));
        insurancePackage.setInspRangeStart(rs.getDouble("insp_range_start"));
        insurancePackage.setInspRangeEnd(rs.getDouble("insp_range_end"));
        insurancePackage.setInspAgeLimitStart(rs.getInt("insp_agelimit_start"));
        insurancePackage.setInspAgeLimitEnd(rs.getInt("insp_agelimit_end"));
        insurancePackage.setInspCDate(rs.getDate("insp_cdate"));

        return insurancePackage;
    }
}
