package com.Itp.MyFirstITP;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Itp.model.Player;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
//    	Player player = new Player(1, "Virat", 50, 4000);
//    	Player player = new Player(2, "Rohit", 60, 5500);
    	
    	Player player = new Player("Hardilk", 40, 2000);
    	Player player1 = new Player("Pujara", 108, 12000);
    	Player player2 = new Player("Shubham", 80, 9000);
    	
   
    	
    	session.save(player);
    	session.save(player1);
    	session.save(player2);
          tx.commit();

          session.close();
    	System.out.println(factory);
    	System.out.println(factory.isClosed());

    }
}
