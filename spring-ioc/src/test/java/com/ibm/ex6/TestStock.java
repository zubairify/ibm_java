package com.ibm.ex6;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStock {

	@Test
	public void testStock() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		
		Stock s1 = (Stock) ctx.getBean("stk");
		
		Stock s2 = (Stock) ctx.getBean("stk");
		
		System.out.println(s1 == s2);
	}
}
