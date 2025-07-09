package com.Itp.MyFirstITP;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Itp.model.CheifMinister;
import com.Itp.model.State;


public class AppOneToOne 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
 
      State S1= State.builder()
    		  .StateName("Maharastra")
    		  .StateCaptital("Mumbai")
    		  .build();
    
      State S2= State.builder()
    		  .StateName("Rajasthan")
    		  .StateCaptital("Jaipur")
    		  .build();
    
      
      CheifMinister C1 = CheifMinister.builder()
    		  .CmName("Fadnavis")
    		  .age(55)
    		  .build();
      
      CheifMinister C2 = CheifMinister.builder()
    		  .CmName("Sharama")
    		  .age(65)
    		  .build();
      
      
      S1.setCheifMinister(C1);
      S2.setCheifMinister(C2);
        
      
      session.save(S1);
      session.save(S2);
    	tx.commit();
    	
        
          session.close();
          factory.close();

    }
}
