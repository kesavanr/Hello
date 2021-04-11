package com.employee.details;

public class variabl {

	int a=11;
	static int st1=21;
	public void addi() {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println("local variable : " + a);
		
		variabl v1= new variabl();
		System.out.println("Class Variable : " + v1.a);
	}
	protected static void addi(int a, int b) {
		// TODO Auto-generated method stub		
		System.out.println("addi 2 : " + (a +b));
		System.out.println("local variable : " + a);
	}
	public void addi(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println("addi 3 : " + (a +b+c));
	}
	public String addi(int a, int b, int c, int d) {
		// TODO Auto-generated method stub
		String ret;
		int sum=a+b+c+d;
		
		ret= "Return Value : " + sum;
		return ret;
	}
	public static void main(String[] args) {
		variabl v1= new variabl();
		v1.addi();
		addi(8,7);
		v1.addi(8,7,6);
		String ret = v1.addi(8,7,6,5);
		System.out.println(ret);
		System.out.println("Class Variable : " + v1.a);
		System.out.println("Staic Variable : " + st1);
	}
}
