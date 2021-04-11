package com.employee.details;

public class Bank1 extends HDFC{

	@Override
	public void perLoan() {
		// TODO Auto-generated method stub
		System.out.println("30%");
	}
	
	public static void main(String[] args) {
		Bank1 b1= new Bank1();
		b1.carLoan();
		b1.homLoan();
		b1.perLoan();
		
		new Bank1().carLoan();
		new Bank1().homLoan();
		new Bank1().perLoan();
	}
}
