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
    	


    	Player player= session.load(Player.class, 13);
    	System.out.println(player);
          
          session.close();

          factory.close();
    }
}
