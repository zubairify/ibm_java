package com.ibm.ex1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
	
	@Test
	public void testHello2() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("ex1ctx2.xml");
		Hello h = (Hello) appCtx.getBean("hi");
		
		System.out.println("Message: " + h.getMessage());
	}
	
	@Test
	public void testHello3() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("ex1ctx2.xml");
		Hello h = (Hello) appCtx.getBean("hi");
		
		System.out.println("Message: " + h.getMessage());
	}
	
	@Test
	public void testHello4() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("ex1ctx2.xml");
		Hello h = (Hello) appCtx.getBean("hi");
		
		System.out.println("Message: " + h.getMessage());
	}
	
	@Test
	public void testHello5() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("ex1ctx2.xml");
		Hello h = (Hello) appCtx.getBean("hi");
		
		System.out.println("Message: " + h.getMessage());
	}
}
