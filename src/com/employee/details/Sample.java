package com.employee.details;

import java.util.Iterator;

public class Sample {
	public static void main(String[] args) {
		int a[] =new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;

		System.out.println("Index value : " + a[4]);
		System.out.println("=============");
		
		/*for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("=============");
		
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("=============");*/
		
		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			System.out.println(j);
		}
		System.out.println("=============");		
	}
}
