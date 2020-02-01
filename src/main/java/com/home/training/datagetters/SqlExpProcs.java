package com.home.training.datagetters;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.home.training.dbconfig.SqlExpressJdbcConfig;
import com.home.training.entities.SalesOrderHeader;
import com.home.training.mappers.SalesOrderHeaderMapper;

public class SqlExpProcs {
	DataSource dataSource = new SqlExpressJdbcConfig().SqlExpDataSource();
	JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

	public SqlExpProcs() throws Exception {
		super();
	}

	public Integer GetSalesOrderHeaderCount()
	{
		return jdbcTemplate.queryForObject("select COUNT(*) FROM [Sales].[SalesOrderHeader]", Integer.class);
	}

	public List<SalesOrderHeader> GetSalesOrderHeaders()
	{
		String query = "SELECT * FROM [Sales].[SalesOrderHeader]";
		List<SalesOrderHeader> headers = jdbcTemplate.query(query, new SalesOrderHeaderMapper());			
		return headers;
	}

}
