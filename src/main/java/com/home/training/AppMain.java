package com.home.training;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.home.training.datagetters.OracleProcs;
import com.home.training.datagetters.SqlExpProcs;
import com.home.training.entities.Department;
import com.home.training.entities.SalesOrderHeader;

public class AppMain {
	
	public static void main(String[] args) {

		try {
			final Logger logger = LoggerFactory.getLogger(AppMain.class);
			logger.info("------ JDBCTesting Started ------");

			final OracleProcs oracleProcs = new OracleProcs();
			final SqlExpProcs sqlExpProcs = new SqlExpProcs();

			logger.info("dept records found: " + String.valueOf(oracleProcs.GetDepartmentCount()));
			List<Department> depts = oracleProcs.GetDepartments();			
			depts.forEach(dept -> {logger.info(dept.toString());} );
			
			logger.info("sales headers found: " + String.valueOf(sqlExpProcs.GetSalesOrderHeaderCount()));
			List<SalesOrderHeader> headers = sqlExpProcs.GetSalesOrderHeaders();			
			headers.forEach(dept -> {logger.info(dept.toString());} );

			
			logger.info("------ JDBCTesting Finished ------");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("------ JDBCTesting Failed ------");
		}

	}

}
