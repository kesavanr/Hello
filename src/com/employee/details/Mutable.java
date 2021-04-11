package com.employee.details;

public class Mutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "kesavanr";
		String b= "kesavanr";
		String c= "Gopal";		
				
		System.out.println("============ IMMUTABLE - Literal");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		String concat = a.concat(b);
		System.out.println("concat1 : " + concat);
		
		System.out.println("a : " + System.identityHashCode(a));
		System.out.println("b : " + System.identityHashCode(b));
		System.out.println("c : " + System.identityHashCode(c));
		System.out.println("concat1 : " + System.identityHashCode(concat));
		System.out.println("====================================");
		
		StringBuffer a1= new StringBuffer("kesavanr");
		StringBuffer b1= new StringBuffer("kesavanr");
		StringBuffer c1= new StringBuffer("Gopal");		
		
		System.out.println("============ MUTABLE - Non Literal");
		System.out.println("a1 : " + a1);
		System.out.println("b1 : " + b1);
		System.out.println("c1 : " + c1);
		StringBuffer append1= a1.append(b1);
		System.out.println("append1 : " + append1);
		
		System.out.println("a1 : " + System.identityHashCode(a1));
		System.out.println("b1 : " + System.identityHashCode(b1));
		System.out.println("c1 : " + System.identityHashCode(c1));
		System.out.println("append1 : " + System.identityHashCode(append1));
		System.out.println("====================================");
	}

}
