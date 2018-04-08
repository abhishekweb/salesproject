package com.salesproject.main;

import com.salesproject.main.dao.Sales;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is main class");
		Sales obj = new Sales();
		obj.setCategory("Online");
		obj.setDescription("For online");

	}

}
