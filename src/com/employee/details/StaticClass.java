package com.employee.details;

public class StaticClass {
	public static int i1=30;

	public static void main(String[] args) {
		System.out.println(i1); // Without using object

		staticFun(); // Without using object
	}

	public static void staticFun() {
		// TODO Auto-generated method stub
		System.out.println("Call Static Function");
	}
}
