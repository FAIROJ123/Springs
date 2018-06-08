package com.bridgeit.DAO;

import com.bridgeit.model.User;

public interface UserDAO {

	public int insertUserData(User user);
	
	public User getUser(String username,String password);
}
