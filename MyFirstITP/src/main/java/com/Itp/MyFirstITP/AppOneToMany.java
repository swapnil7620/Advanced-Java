package com.Itp.MyFirstITP;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Itp.model.Dept;
import com.Itp.model.Employee;


public class AppOneToMany 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
 
    	Dept d1=Dept.builder()
    			.dname("IT")
    			.city("Pune")
    			.build();
    	
    	Dept d2=Dept.builder()
    			.dname("Sales")
    			.city("Delhi")
    			.build();
    	
    	Employee e1=Employee.builder()
    			.ename("Alice")
    			.salary(800.0)
    			.build();
    	
    	Employee e2=Employee.builder()
    			.ename("Ben")
    			.salary(900.0)
    			.build();
    	
    	Employee e3=Employee.builder()
    			.ename("Chris")
    			.salary(100.0)
    			.build();
    	
    	Employee e4=Employee.builder()
    			.ename("David")
    			.salary(200.0)
    			.build();
    	
    	d1.setEmployees(Arrays.asList(e1,e2));
    	d2.setEmployees(Arrays.asList(e3,e4));
 
    	session.save(d1);
    	session.save(d2);
    		 
    	tx.commit();
    	
        
          session.close();
          factory.close();

    }
}
