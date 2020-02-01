package com.home.training.datagetters;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.home.training.dbconfig.Orcl1JdbcConfig;
import com.home.training.entities.Department;
import com.home.training.mappers.DepartmentRowMapper;

public class OracleProcs {

	DataSource dataSource = new Orcl1JdbcConfig().orcl1DataSource();
	JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

	public OracleProcs() throws Exception {
		super();
	}

	public Integer GetDepartmentCount()
	{
		return jdbcTemplate.queryForObject("select COUNT(*) FROM HR.DEPARTMENTS", Integer.class);
	}
	
	
	public List<Department> GetDepartments()
	{
		String query = "SELECT * FROM HR.DEPARTMENTS";
		List<Department> depts = jdbcTemplate.query(query, new DepartmentRowMapper());			
		return depts;
	}

}
