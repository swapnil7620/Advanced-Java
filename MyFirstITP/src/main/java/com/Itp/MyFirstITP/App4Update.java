package com.Itp.MyFirstITP;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Itp.model.Customer;
import com.Itp.model.Customer.CustomerBuilder;


public class App4Update 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
 
       Customer customer1 = session.get(Customer.class,5);	
       customer1.setCustomerName("Yuvraj");
        
       session.saveOrUpdate(customer1);
    
    
    	tx.commit();
    	
        
          session.close();
          factory.close();

    }
}
