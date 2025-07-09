package com.Itp.MyFirstITP;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Itp.model.Dept;


public class AppOneToManyDelete 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
 
    	Dept d1 = session.get(Dept.class, 2);
    	session.delete(d1);
    	tx.commit();
    	
        
          session.close();
          factory.close();

    }
}
