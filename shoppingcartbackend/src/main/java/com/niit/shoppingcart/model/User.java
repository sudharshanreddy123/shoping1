package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class User {
	
	@Id
	private String id;
	
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getAdmin() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isValidUser(String userID, String password2) {
		// TODO Auto-generated method stub
		return false;
	}

	public User get(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
