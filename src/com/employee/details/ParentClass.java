package com.employee.details;

public class ParentClass {
	
	int i=30;// Parent Class level variable
	
	public void buyname() {
		// TODO Auto-generated method stub
		System.out.println("1. Parent class");
	}

	
	/*public void overriFun(String str) {
		System.out.println("1. Override Function : " + str);

	}*/
	public static void main(String[] args) {
		//ParentClass r1= new ParentClass();
		//r1.buyname();
		//r1.overriFun("Call 2");
		
		ParentClass r2= new ChildClass();
		r2.buyname();
		
		
	}
}
