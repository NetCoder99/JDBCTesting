package com.home.training.dbconfig;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.home.training.security.GetSecrets;

@Configuration
public class Orcl1JdbcConfig {

	@Bean
    public DataSource orcl1DataSource() throws Exception {
		
		String passWord = new GetSecrets().GetPassword("oracle");
		
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@192.168.0.19:1521:orcl1");
        dataSource.setUsername("HR");
        dataSource.setPassword(passWord);
        return dataSource;
    }
}
