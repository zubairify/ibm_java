package com.ibm.ex1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:ex1ctx.xml")
public class TestHello2 {
	@Autowired
	private ApplicationContext ctx;
	
	@Autowired
	@Qualifier("hi")
	private Hello hi;
	
	@Test
	public void testHello() {
		System.out.println("Message: " + hi.getMessage());
	}
	
	@Test
	public void testHello2() {
		Hello h2 = (Hello) ctx.getBean("hi");
		System.out.println("Message: " + h2.getMessage());
	}
	
	@Test
	public void testHello3() {
		System.out.println("Message: " + hi.getMessage());
	}
	
	@Test
	public void testHello4() {
		System.out.println("Message: " + hi.getMessage());
	}
}
