package com.Itp.MyFirstITP;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Itp.model.Customer;


public class App3 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
 
    	
    	 Customer customer = new Customer(3, "Dhoni", "777777777", "Ranchi");
    	
    	Customer c1 = new Customer();
    	c1.setCustomerName("Rohit");
    	c1.setCustomerCity("Mumbai");
    	c1.setCustomerNumber("9999999999");
    	
    	Customer c2=Customer.builder()
    			.CustomerID(2)
    			.CustomerName("Virat")
    			.CustomerCity("Delhi")
    			.CustomerNumber("88888888")
    			.build();
    	      
    	session.save(c2);
    	
    	// To delete the data from database
//    	session.delete(c2);
    	
    	session.save(customer);
    	tx.commit();
    	
        
          session.close();
          factory.close();

    }
}
