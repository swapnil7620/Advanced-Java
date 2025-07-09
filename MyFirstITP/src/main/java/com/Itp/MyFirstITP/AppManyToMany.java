package com.Itp.MyFirstITP;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Itp.model.Actors;
import com.Itp.model.Movies;


public class AppManyToMany 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	
    	Actors a1 = Actors.builder()
    			.Aname("SRK")
    			.age(60)
    			.build();
    	
    	Actors a2 = Actors.builder()
    			.Aname("Priyanka")
    			.age(49)
    			.build();
    	
    	Actors a3 = Actors.builder()
    			.Aname("Tapsi")
    			.age(44)
    			.build();
    	
    	Actors a4 = Actors.builder()
    			.Aname("Dipika")
    			.age(46)
    			.build();
    	
    	Movies m1 = Movies.builder()
    			.Mname("Don")
    			.Year("2012")
    			.build();
    	
    	Movies m2 = Movies.builder()
    			.Mname("CE")
    			.Year("2014")
    			.build();
    	
    	Movies m3 = Movies.builder()
    			.Mname("Jawan")
    			.Year("2024")
    			.build();
    	
    	List<Movies> srkMovies= new ArrayList<Movies>();
    	srkMovies.add(m1);
    	srkMovies.add(m2);
    	srkMovies.add(m3);
 
 
    	List<Movies> dMovies = new ArrayList<Movies>();
    	dMovies.add(m1);
    	dMovies.add(m2);
    	dMovies.add(m3);
    	
    	
    	List<Movies> pMovies = new ArrayList<Movies>();
    	pMovies.add(m1);
    	
    	a1.setActormovies(srkMovies);
    	a2.setActormovies(dMovies);
    	a3.setActormovies(pMovies);
    	
    	session.save(a1);
    	session.save(a2);
    	session.save(a3);
    	
         	tx.commit();
    	
        
          session.close();
          factory.close();

    }
}
