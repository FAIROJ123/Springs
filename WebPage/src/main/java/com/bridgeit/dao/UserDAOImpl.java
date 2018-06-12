package com.bridgeit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bridgeit.model.User;
import com.springsource.tcserver.serviceability.request.DataSource;

// @Repository
public  class UserDAOImpl implements UserDAO 
{
	  @Autowired
	  JdbcTemplate jdbcTemplate;

	  
	  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}

	@Override
	public int insertUserData(User user) {
		
		System.out.println("Name:"+user.getName());
		System.out.println("password:"+user.getPassword());
		System.out.println("username:"+user.getUsername());
		System.out.println("phone:"+user.getPhone());
		
	
		String sql = "insert into User(name,userName,password,phonenumber) values(?,?,?,?)";
		System.out.println("ranu");
		
		int i = jdbcTemplate.update(sql, new Object[] { user.getName(),user.getUsername(), user.getPassword(), user.getPhone() });
          
			 System.out.println("ssuccesfully");   
		return i;
	}

	@Override
	public User getUser(User user) {
		System.out.println("Username:"+user.getUsername());
		System.out.println("password:"+user.getPassword());
		
	    String sql = "select * from User where username='" + user.getUsername() + "' and password='" + user.getPassword() + "'";
	    System.out.println(sql);
	    List<User> users = jdbcTemplate.query(sql, new UserMapper());
	    return users.size() > 0 ? users.get(0) : null;
	    		
	   
	}
}

	
	 class UserMapper implements RowMapper<User> {

		  public User mapRow(ResultSet rs, int arg1) throws SQLException {

		    User user = new User();

		    user.setName(rs.getString("name"));
		   
		    user.setUsername(rs.getString("userName"));

		    user.setPassword(rs.getString("password"));
            
		    user.setPhone(rs.getString("phonenumber"));

		    return user;

		  }

		
	 
	

}