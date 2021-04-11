package com.employee.details;

public class CallStatic{
	static {
		System.out.println("Static Block 1");
	}
	static {
		System.out.println("Static Block 3");
	}
	
	public static void main(String[] args) {
		System.out.println(StaticClass.i1); // Without using object
		StaticClass.staticFun();  // Without using object
		
		
	}
	static {
		System.out.println("Static Block 2");
	}
}
