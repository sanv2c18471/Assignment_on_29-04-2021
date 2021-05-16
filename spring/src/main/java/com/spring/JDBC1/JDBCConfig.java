package com.spring.JDBC1;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.JDBC1.DAO.EmployeeDAO;
import com.spring.JDBC1.DAO.EmployeeDAOImpl;

@Configuration
@ComponentScan(basePackages = {"com.spring.JDBC1.DAO"})

public class JDBCConfig {
	
	@Bean("ds")
  public DataSource getDataSource() {
	  DriverManagerDataSource ds= new DriverManagerDataSource();
	  ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	  ds.setUrl("jdbc:mysql://Localhost:3306/JDBC1");
	  ds.setUsername("root");
	  ds.setPassword("root");
	  return ds;
  }
	
	
	@Bean("jdbctemplate1")
	public JdbcTemplate getTemplate() 
	{
	JdbcTemplate jdbctemplate1=new JdbcTemplate();
	jdbctemplate1.setDataSource(getDataSource());
		return jdbctemplate1;
	}
	
	/*
	 * @Bean("empDAO") public EmployeeDAO getEmployeeDAO() { EmployeeDAOImpl
	 * empl=new EmployeeDAOImpl(); empl.setJdbctemplate(getTemplate()); return empl;
	 * 
	 * }
	 */
	
}
