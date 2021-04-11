package com.employee.details;

public class A extends B {

	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1 AClass");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
	}

	public A() {
		//this("JAVA");//1
		//super(12);
		System.out.println("Default const...");
	}

	/*public A(int id) {//3
		this(3456.5678f);
		System.out.println(id);
	}

	public A(String name) {//2
		this(12);
		System.out.println(name);
	}

	public A(float sal) {//4
		System.out.println(sal);
	}*/

}
