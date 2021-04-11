package com.employee.details;

import java.util.Scanner;

public class GetDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*empId
		name
		email
		phoneNum
		salary
		gender
		city*/
		
		Scanner sc1= new Scanner(System.in);
		
		System.out.println("Enter empId :");
		String eid= sc1.next();	
		
		System.out.println("Enter name :");
		String empName= sc1.next();	
		
		System.out.println("Enter email :");
		String email= sc1.next();		
		
		System.out.println("Enter phoneNum :");
		double phoneNum= sc1.nextDouble();
		
		System.out.println("Enter salary :");
		double salary= sc1.nextDouble();
		
		System.out.println("Enter gender :");
		String gender= sc1.next();	
		
		System.out.println("Enter city :");
		String city1= sc1.next();
		
		System.out.println("");		
		System.out.println("");
		System.out.println("Details");
		System.out.println("--------");
		System.out.println("Eid : " + eid);
		System.out.println("Emp Name : " + empName);
		System.out.println("Email : " + email);
		System.out.println("Phone Num : " + phoneNum);
		System.out.println("Salary : " + salary);
		System.out.println("Gender : " + gender);
		System.out.println("City : " + city1);
		
	}

}
