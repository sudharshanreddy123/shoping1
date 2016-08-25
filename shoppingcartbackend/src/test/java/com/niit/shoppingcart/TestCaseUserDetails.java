package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;

import com.niit.shoppingcart.dao.UserDetailsDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.UserDetails;

public class TestCaseUserDetails {

  
 static UserDetailsDAO userDetailsDAO;
  
  
  
 static UserDetails userDetails;
  
  
  static AnnotationConfigApplicationContext context;
  @BeforeClass
  public static void init()
  {
  context = new AnnotationConfigApplicationContext();
  context.scan("com.niit");
  context.refresh();
  userDetails=(UserDetails)  context.getBean("userDetails");
  userDetailsDAO= (UserDetailsDAO) context.getBean("userDetailsDAO");
  
  
  }
  @Test
  public void UserDetailsNameTest()
  {
	  userDetails= userDetailsDAO.get("UD123");
	  String name= userDetails.getName();
	  assertEquals("Category Name Test " , "UDName123"       ,name);
  }
  
}
