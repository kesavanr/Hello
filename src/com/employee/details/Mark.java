package com.employee.details;

import java.util.Scanner;

public class Mark {

	public static int totalMarks(int m1, int m2, int m3, int m4, int m5) {
		return m1+m2+m3+m4+m5;
	}
	public static int Avg(int totalMarks) {
		return totalMarks/5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		
		/*studId
		studName
		m1
		m2
		m3
		m4
		m5*/
		
		System.out.println("Enter Student Id :");
		String sid = sc1.nextLine();
		
		System.out.println("Enter Student Name :");
		String studName = sc1.nextLine();
		
		System.out.println("Enter M1 :");
		int m1 = sc1.nextInt();
		
		System.out.println("Enter M2 :");
		int m2 = sc1.nextInt();
		
		System.out.println("Enter M3 :");
		int m3 = sc1.nextInt();
		
		System.out.println("Enter M4 :");
		int m4 = sc1.nextInt();
		
		System.out.println("Enter M5 :");
		int m5 = sc1.nextInt();
		
		
		int sum = totalMarks(m1, m2, m3, m4, m5);
		int avg = Avg(sum);
		
		System.out.println("Total  Marks : " + sum);
		System.out.println("Average : " + avg);
		
	}

}
