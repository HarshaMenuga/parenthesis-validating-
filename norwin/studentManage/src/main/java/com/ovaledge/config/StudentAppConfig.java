package com.ovaledge.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.ovaledge"})
public class StudentAppConfig {
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbctemplate = new JdbcTemplate(dataSource());
		return jdbctemplate;
	}
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setUsername("root");
		data.setPassword("root");
		data.setUrl("jdbc:mysql://localhost:3306/project");
		data.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return data;
		
	}
}
