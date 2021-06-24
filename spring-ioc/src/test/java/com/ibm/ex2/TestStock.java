package com.ibm.ex2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStock {

	@Test
	public void testStock() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ex2ctx.xml");
		
		Stock s1 = (Stock) ctx.getBean("stk");
		
		Stock s2 = (Stock) ctx.getBean("stk");
		
		System.out.println(s1 == s2);
	}
}
