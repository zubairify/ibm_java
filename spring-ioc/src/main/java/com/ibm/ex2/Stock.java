package com.ibm.ex2;

public class Stock {
	
	public Stock() {
		System.out.println("Default constructor");
	}
	
	private static Stock stock;
	
	public static Stock get() {
		System.out.println("Stock singleton");
		if(stock == null)
			stock = new Stock();
		return stock;
	}
}
