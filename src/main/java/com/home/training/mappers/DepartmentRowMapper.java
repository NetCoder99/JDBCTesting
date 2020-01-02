package com.home.training.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.home.training.entities.Department;

public class DepartmentRowMapper implements RowMapper<Department> {

    @Override
    public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
    	Department department = new Department();
 
    	department.setDEPARTMENT_ID(rs.getInt("DEPARTMENT_ID"));
    	department.setDEPARTMENT_NAME(rs.getString("DEPARTMENT_NAME"));
    	department.setMANAGER_ID(rs.getInt("MANAGER_ID"));
    	department.setLOCATION_ID(rs.getInt("lOCATION_ID"));
 
        return department;
    }
    
}
