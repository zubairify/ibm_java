package com.ibm.ex8;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessage {

	@Test
	public void testMessage() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");

//		MessageProcessor proc = ctx.getBean("mp", MessageProcessor.class);
		MessageProcessor proc = (MessageProcessor) ctx.getBean("mp");

		proc.process("sms", "9820108880", "Hello buddy!");
		proc.process("email", "zubair@mail.com", "Hola amigo");
	}
}
