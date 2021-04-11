package com.classes;

public class ChildB extends ParentA{

	public static void main(String[] args) {
		ParentA A = new ChildB();
		A.getName();
	}
	@Override
	public void getName() {
		System.out.println("Child Class");
		//super.getName();
	}
}
