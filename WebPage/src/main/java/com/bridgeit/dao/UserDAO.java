package com.bridgeit.dao;

import com.bridgeit.model.User;

public interface UserDAO {

	public int insertUserData(User user);
	
	public User getUser(User user);
}
