package com.itp.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Player;

public class DriverPlayerBean  {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		
		System.out.println("hello");
		Player player = beanFactory.getBean("P1",Player.class);
		System.out.println(player);
		Player player2 = beanFactory.getBean("P1",Player.class);	
		System.out.println(player2);
		player=null;
		player2=null;
		beanFactory.close();
		System.gc();
		
	}
}
