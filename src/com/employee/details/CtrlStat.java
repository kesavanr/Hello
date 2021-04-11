package com.employee.details;

public class CtrlStat {
	public static void main(String[] args) {
		System.out.println("---------------------- Task 1");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("---------------------- Task 2");		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("---------------------- Task 3");		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("---------------------- Task 4");		
		for (int i = 1; i <= 100; i++) {
			if (i == 5) {
				System.out.println(i);
			}
		}
		
		System.out.println("---------------------- Task 5 Break Statement");		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("---------------------- Task 6 Continue Statement");		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("---------------------- Task 7");		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println(j);
			}
		}
		
		System.out.println("---------------------- Task 8");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println(i);
			}
		}
		
		System.out.println("---------------------- Task 9");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(j);
			}
		}
		
		System.out.println("---------------------- Task 10");
		for (int i = 1; i <= 3; i++) {
			for (int j = i + 1; j <= 3; j++) {
				System.out.println(j);
			}
		}
		
		System.out.println("---------------------- Task 11");
		for (int i = 1; i <= 3; i++) {
			for (int j = i + 1; j <= i; j++) {
				System.out.println(j);
			}
		}
		/*
		int i=5;
		if (i == 5) {
			break;
		}
		System.out.println(i);
		
		int i1=5;
		if (i1 == 5) {
			continue;
		}
		System.out.println(i);
		*/
	}
}
