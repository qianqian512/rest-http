package org.hum.resthttp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		System.out.println("11");
		((ClassPathXmlApplicationContext)applicationContext).close();
	}
}
