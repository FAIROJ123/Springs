package com.bridgeit.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bridgeit.model.User;
import com.springsource.tcserver.serviceability.request.DataSource;

public  class UserDAOImpl implements UserDAO {

	private JdbcTemplate jdbcTemplate;
	private DataSource datasource;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	

	@Override
	public int insertUserData(User user) {
		String sql = "insert into User values(?,?,?,?)";
		 jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getPhone() });

			    
		return jdbcTemplate.update(sql);
	}

	@Override
	public User getUser(String username, String password) {
		User user = new User();
	    String sql = "select * from User where username='" + user.getUsername() + "' and password='" + user.getPassword() + "'";
		return user;
	}

	
	

}