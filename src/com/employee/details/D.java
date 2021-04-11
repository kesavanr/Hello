package com.employee.details;

public class D extends A implements BI, CI{

	public void method6() {
		// TODO Auto-generated method stub
		System.out.println("method6 D");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		d.method1();
		d.method2();
		d.method3();
		d.method4();
		d.method5();
		d.method6();
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("method4 CI");
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub
		System.out.println("method5 CI");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2 BI");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("method3 BI");
	}

}
