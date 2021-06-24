package com.ibm.ex8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service("mp")
public class MessageProcessor {
	@Autowired
	private ApplicationContext appCtx;
	
	public MessageProcessor() {
		System.out.println("MessageProcessor Constructor");
	}
	
	public void process(String type, String to, String msg) {
		Message m = appCtx.getBean(type, Message.class);
		m.send(to, msg);
	}
}
