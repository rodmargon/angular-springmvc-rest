package com.mycompany.springmvcrest.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class DataSourceConfig {
	
	private static final String ENV_JDBC_PASS = "jdbc.password";
	private static final String ENV_JDBC_USERNAME = "jdbc.username";
	private static final String ENV_JDBC_URL = "jdbc.url";

	@Autowired
	private Environment env;
	
	@Bean
	public DataSource testDataSource() {
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("com.mysql.jdbc.driver");
		bds.setUrl("jdbc:mysql://localhost:3306");
		bds.setUsername(env.getProperty(ENV_JDBC_USERNAME));
		bds.setPassword(env.getProperty(ENV_JDBC_PASS));
		return bds;
	}
	
	
}
