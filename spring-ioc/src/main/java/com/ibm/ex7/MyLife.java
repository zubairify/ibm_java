package com.ibm.ex7;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ibm.ex8.Message;

@Component
public class MyLife {
	@Autowired
	@Qualifier("sms")
	private Message m1;
	
	public MyLife() {
		System.out.println("Default constructor");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Life-Cycle Init");
		m1.send("whoever", "whatever");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Life-Cycle Destroy");
	}
}
