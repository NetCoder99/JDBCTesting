package com.home.training;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import com.home.training.dbconfig.Orcl1JdbcConfig;
import com.home.training.entities.Department;
import com.home.training.mappers.DepartmentRowMapper;

public class AppMain {
	
	public static void main(String[] args) {

		try {
			final Logger logger = LoggerFactory.getLogger(AppMain.class);
			logger.info("------ JDBCTesting Started ------");

			DataSource dataSource = new Orcl1JdbcConfig().orcl1DataSource();
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

			int result = jdbcTemplate.queryForObject("select COUNT(*) FROM HR.DEPARTMENTS", Integer.class);
			logger.info("dept records found: " + String.valueOf(result));


			String query = "SELECT * FROM HR.DEPARTMENTS";
			List<Department> depts = jdbcTemplate.query(query, new DepartmentRowMapper());			
			
			depts.forEach(dept -> {
				logger.info(dept.toString());
			} );
			
			logger.info("------ JDBCTesting Finished ------");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("------ JDBCTesting Failed ------");
		}

	}

}
