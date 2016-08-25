package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Cart;

public interface CartDAO {



	public List<Cart> list();

	public Cart get(String id);
	
	public void saveOrUpdate(Cart cart);

	public void delete(String id);

	public Object list(String loggedInUserid);

	public Object getTotalAmount(String loggedInUserid);



}
