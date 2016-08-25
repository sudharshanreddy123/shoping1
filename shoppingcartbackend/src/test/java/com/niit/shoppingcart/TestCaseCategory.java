package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;

import com.niit.shoppingcart.model.Category;

public class TestCaseCategory {

  @Autowired
 static CategoryDAO categoryDAO;
  
  @Autowired
  
 static Category category;
  
  
  static AnnotationConfigApplicationContext context;
  @Before
  public  void init()
  {
  context = new AnnotationConfigApplicationContext();
  context.scan("com.niit");
  context.refresh();
  category=(Category)  context.getBean("category");
  categoryDAO= (CategoryDAO) context.getBean("categoryDAO");
  
  
  }
  @Test
  public void CategoryNameTest()
  {
	  category= categoryDAO.get("CG123");
	  String name= category.getName();
	  assertEquals("Category Name Test " , "CGName123"       ,name);
  }
  
}
