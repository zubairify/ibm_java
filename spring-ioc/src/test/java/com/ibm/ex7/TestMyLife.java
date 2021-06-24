package com.ibm.ex7;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyLife {

	@Test
	public void testLife() {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		MyLife life = (MyLife) ctx.getBean(MyLife.class);
		
		ctx.close();
		
	}
}
