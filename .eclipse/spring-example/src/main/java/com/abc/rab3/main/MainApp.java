package com.abc.rab3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.rab3.pojos.Driver;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
		
		Driver d1 = (Driver) ctx.getBean("driver1");
		System.out.println(d1.toString());
		
		
		
		
	}

}
