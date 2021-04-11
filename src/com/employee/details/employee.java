package com.employee.details;

import java.util.Scanner;

public class employee extends variabl {

	public employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Non-Para constructor");
	}
	public employee (String str) {
		System.out.println("Constructor : " + str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to java");
		//employee e1=new employee();		
		//employee e2=new employee("Constructor");
		
		//new employee();
		employee e1= new employee();
		new employee("Para const");
		
		/*Scanner sc1=new Scanner(System.in);
		System.out.println("Enter name :");
		String str= sc1.nextLine();
		
		System.out.println("Enter age :");
		Integer age= sc1.nextInt();
		
		System.out.println("Enter salary :");
		Double sal= sc1.nextDouble();
		
		System.out.println("Get one word :");
		String word= sc1.next();
		
		System.out.println("Details :\n");
		System.out.println("name : " + str + "\n");
		System.out.println("age : " + age + "\n");
		System.out.println("salary : " + sal + "\n");
		System.out.println("one word : " + word + "\n");*/
		
		System.out.println("Staic Variable : " + st1);
		
		variabl.addi(1,2);
	}

}
