package com.home.training.dbconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.home.training.security.GetSecrets;

@Configuration
public class SqlExpressJdbcConfig {

	@Bean
    public DataSource SqlExpDataSource() throws Exception {
		String passWord = new GetSecrets().GetPassword("sqlexp");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://localhost;databaseName=AdventureWorks2016");
        dataSource.setUsername("EFCore1");
        dataSource.setPassword(passWord);
        return dataSource;
    }
}
