package com.employee.details;

public class Bank2 implements IDFC{
	public static void main(String[] args) {
		IDFC.carloan();
		
		new Bank2().perloan();
	}

/*
	@Override
	public void carloan() {
		// TODO Auto-generated method stub
		System.out.println("40%");
	}
*/
	@Override
	public void perloan() {
		// TODO Auto-generated method stub
		System.out.println("50%");
	}

	
}
