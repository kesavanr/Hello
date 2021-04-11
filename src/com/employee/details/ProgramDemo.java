package com.employee.details;

import java.util.Iterator;

public class ProgramDemo {

	public static void main(String[] args) {

		/*armstrong();
		palindrome();
		reverseNumber();
		factorial();
		fibonacciSeries();		
		swappingWithVariable();
		swappingWithOutVariable();
		findPrimeNumber1();
		ascendingOrder();
		decendingOrder();
		maximumValue();
		minimumValue();
		reverseStringM1();*/
		findPrimeNumber1();
	}

	public static void armstrong() {
		for (int k = 1; k <= 500; k++) {
			int i = 0, j = 0, a = 0;
			a = k;
			while(a > 0) {
				i = a % 10;
				j = j + (i * i * i);
				a = a / 10;
			}			
			if(j==k) {
				System.out.println("Amstrong Number is : " + k);				
			}
		}
		System.out.println("==============================\n");
	}

	public static void palindrome() {
		for (int k = 1; k < 499; k++) {
			int i = 0, j = 0, a = 0;
			a = k;
			while (a > 0) {
				i = a % 10;
				j = (j * 10 + i);
				a = a / 10;
			}
			if(k == j) {
				System.out.println("Palindrome number is : " + k);
			}
		}
		System.out.println("==============================\n");
	}

	public static void reverseNumber() {
		int i = 0, j = 0, a = 0;
		a = 12345;
		while (a > 0) {
			i = a % 10;
			j = (j * 10 + i);
			a = a / 10;
		}
		System.out.println("Reverse number is : " + j);
		System.out.println("==============================\n");
	}

	public static void factorial() {
		int fact = 1;
		int n = 5;
		for (int i = 1; i <= n; i++) {
			fact = fact + (fact*i);
			System.out.println(fact);
		}
		System.out.println(n + " factorial value is " + fact);

	}

	public static void fibonacciSeries() {
		int a=0,b=1,c=0,n=5;

		System.out.println("Fibonacci Series");		
		System.out.println(a);
		for (int i = 0; i <= n; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
	}
	public static void swappingWithVariable() {
		int a=20,b=10,c=0;
		System.out.println("Before swapping");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		c=a;
		a=b;
		b=c;

		System.out.println("After swapping");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	public static void swappingWithOutVariable() {
		int a=20,b=10;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapping WithOut Variable");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	public static void findPrimeNumber() {
		int n=6;
		for (int i = 2; i < n; i++) {
			int flag=1;
			for (int j = 2; j < i-1; j++) {
				if(i%j ==0) {
					flag=0;
					break;
				}
			}
			if(flag == 1)
				System.out.println(i + ",");

		}
	}

	public static void findPrimeNumber1() {
		int n=30;
		for(int i=2;i<n;i++)
		{
			int flag = 1;
			for(int j=2;j<i;j++)
			{
				if(i%j == 0)
				{
					flag=0;
					break;
				}
			}
			if(flag == 1)
				System.out.println(i);
		}

	}

	public static void ascendingOrder() {
		int a[] = {20,5,10,90,75,13};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorting Order");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void decendingOrder() {
		int a[] = {20,5,10,90,75,13};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Decending Order");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void maximumValue() {
		int a[] = {20,5,10,90,75,13};
		int maxValue = a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i] > maxValue) {
				maxValue = a[i];
			}
		}
		
		System.out.println("Maximum value is :" + maxValue);
	}
	
	public static void minimumValue() {
		int a[] = {20,5,10,90,75,13};
		int minValue = a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i] < minValue) {
				minValue = a[i];
			}
		}
		
		System.out.println("Minimum value is : " + minValue);
	}
	
	public static void reverseStringM1() {
		String str = "Welcome";
		//System.out.println(str.length());
		String rev = "";
		for (int i = str.length()-1; i>=0 ; i--) {
			//System.out.println(str.charAt(i));
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse string method1 : " + rev);
		System.out.println("=======================");
		
		String str1="";
		str = "Welcome to java program";
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			rev = "";
			for (int j = split[i].length()-1 ; j >= 0 ; j--) {
				rev = rev + split[i].charAt(j);
			}
			str1 = str1 + rev + " ";
			//System.out.println(rev);
		}
		System.out.println("Reverse string method2 : " + str1);
		System.out.println("=======================");
		
		str1="";
		str = "Welcome to java program";
		split = str.split("");
		for (int i = split.length-1; i >=0  ; i--) {
			str1 = str1 + split[i];
		}
		System.out.println("Reverse string method3 : " + str1);
		System.out.println("=======================");
	}
}
