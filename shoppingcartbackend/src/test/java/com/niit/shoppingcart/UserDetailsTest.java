package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDetailsDAO;
import com.niit.shoppingcart.model.UserDetails;
import com.niit.shoppingcart.config.ApplicationContextConfig;
import com.niit.shoppingcart.config.ApplicationContextConfig;

public class UserDetailsTest {
	
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		
	   UserDetailsDAO userDetailsDAO = 	(UserDetailsDAO) context.getBean("userDetailsDAO");
	   
	   UserDetails userDetails = 	(UserDetails) context.getBean("userDetails");
	   userDetails.setId("UD123");
	   userDetails.setName("UDName123");
	   
	   userDetails.setAddress("mumbai");
	   userDetails.setEmail("email");
	   userDetails.setPassword("xxxxxx");
	   userDetails.setMobile("motrolla");
	   
	   userDetailsDAO.saveOrUpdate(userDetails);

	   System.out.println(" No of suppliers" + userDetailsDAO.list().size()); 
	    
	
	   
  
	   
	  if(   userDetailsDAO.get("sdfsf") ==null)
	  {
		  System.out.println("UserDetails does not exist");
	  }
	  else
	  {
		  System.out.println("UserDetails exist .. the details are ..");
		  System.out.println();
	  }
		
		
	
	}

}
