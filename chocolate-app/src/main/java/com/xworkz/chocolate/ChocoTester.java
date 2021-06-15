package com.xworkz.chocolate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChocoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation = "applicationContext.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(configLocation);
		Chocolate chocolate = container.getBean(Chocolate.class);
		System.out.println(chocolate);
		chocolate.taste();

		DataBase data = container.getBean(DataBase.class);
		System.out.println(data);

		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) container;
		classPathXmlApplicationContext.close();
	}

}
