package com.employee.details;

public class ChildClass extends ParentClass{
	
	int i=20;// Current Class level variable
	@Override
	public void buyname() {
		System.out.println("1. Child class");
		System.out.println("before super");
		super.buyname();
		System.out.println("after super");
		
		int i=10;// Local variable
		
		System.out.println("this & super function");
		System.out.println("Local Variable : " +i); //		
		System.out.println("Current Class Level Refference : " + this.i); //
		System.out.println("Parent Class Level Refferences : " + super.i); //
	}
	public static void main(String[] args) {
		/*ChildClass r1= new ChildClass();
		r1.buyname();
		
		System.out.println("Override Function");
		r1.overriFun("Call 1");*/
		
		ParentClass r2= new ChildClass();
		r2.buyname();
		
	}	
	/*@Override
	public void overriFun(String str) {
		// TODO Auto-generated method stub
		System.out.println("2. Override Function : " + str);
		super.overriFun(str);
		System.out.println("CAll 3");
	}*/
}
