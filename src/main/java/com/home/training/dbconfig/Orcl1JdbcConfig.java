package com.home.training.dbconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Orcl1JdbcConfig {

	@Bean
    public DataSource orcl1DataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@192.168.0.19:1521:orcl1");
        dataSource.setUsername("system");
        dataSource.setPassword("*********");
        return dataSource;
    }
}
