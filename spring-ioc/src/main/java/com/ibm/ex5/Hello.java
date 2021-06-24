package com.ibm.ex5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hi")
public class Hello {
	private String message;
	
	public Hello() {
		System.out.println("Default constructor");
	}
	
	public Hello(String message) {
		this.message = message;
		System.out.println("Parameter constructor");
	}

	public String getMessage() {
		return message;
	}
	@Value("Hello Component")
	public void setMessage(String message) {
		this.message = message;
		System.out.println("Setter method");
	}
}
