package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.UserDetails;

public interface UserDetailsDAO {



	public List<UserDetails> list();

	public UserDetails get(String id);
	
	public void saveOrUpdate(UserDetails userDetails);

	public void delete(String id);

public boolean isValidUser(String userID, String Password);

}
