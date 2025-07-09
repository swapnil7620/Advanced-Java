package com.Itp.MyFirstITP;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Itp.model.Player;

public class App2 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	
    	Session session2=factory.openSession();
    	Transaction tx2=session2.beginTransaction();
    	
    	
    	

        // To fetch the data from data base -- load and get method are used 
    	//get is used when we are sure about data is present in  our database 
    	// Load is used when we are not sure about data is present or not
    	// get return null , load will throws an exception if data is not available
    	
    	Player player= session.get(Player.class,1);
    	System.out.println(player);
    	Player player2= session2.get(Player.class,1);
    	System.out.println(player2);
          
          session.close();

          factory.close();
    }
}
