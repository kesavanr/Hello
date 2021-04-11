package com.employee.details;

import java.util.Scanner;

public class StringFun {

	private void StringFun1() {
		// TODO Auto-generated method stub
		String str= "Welcome to Java Training";

		int length = str.length(); System.out.println("length : " + length);

		boolean equalsIgnoreCase = str.equalsIgnoreCase("Welcome to JAVA Training"); System.out.println(equalsIgnoreCase);

		boolean equals = str.equals("Welcome to Java Training"); System.out.println(equals);
		boolean equals1 = str.equals("Welcome to JAVA Training"); System.out.println(equals1);

		String lowerCase = str.toLowerCase(); System.out.println(lowerCase);

		String upperCase = str.toUpperCase(); System.out.println(upperCase);

		int indexOf = str.indexOf('a'); System.out.println(indexOf);

		int lastIndexOf = str.lastIndexOf('a');	System.out.println(lastIndexOf);

		char charAt = str.charAt(11); System.out.println(charAt);

		boolean startsWith = str.startsWith("Wel"); System.out.println(startsWith);
		boolean startsWith1 = str.startsWith("wel"); System.out.println(startsWith1);

		boolean endsWith = str.endsWith("ing"); System.out.println(endsWith);
		boolean endsWith1 = str.endsWith("inG"); System.out.println(endsWith1);

		boolean contains = str.contains("Java"); System.out.println(contains);
		boolean contains1 = str.contains("java"); System.out.println(contains1);

		String substring = str.substring(11); System.out.println(substring);		
		String substring2 = str.substring(11, 15); System.out.println(substring2);

		String replace = str.replace('t', 'T'); System.out.println(replace);
		String replace2 = str.replace("Java", "c++");System.out.println(replace2);
		String replace3 = str.replace("java", "c++");System.out.println(replace3);

		String str1="Welcome";
		String str2=" ";
		String str3="";
		String str4=null;

		boolean empty1 = str1.isEmpty(); System.out.println("Length : " + str1.length() +  " - " + empty1);
		boolean empty2 = str2.isEmpty(); System.out.println("Length : " + str2.length() +  " - " + empty2);
		boolean empty3 = str3.isEmpty(); System.out.println("Length : " + str3.length() +  " - " + empty3);
		//boolean empty4 = str4.isEmpty(); System.out.println("Length : " + str4.length() +  " - " + empty4);

		if(str4 == null) {
			System.out.println("Null Pointer Exception");
		}
		else {
			boolean empty5 = str4.isEmpty(); System.out.println("Length : " + str4.length() +  " - " + empty5);
		}

		String str5 = "Welcome to java training";
		String[] split = str5.split(" ", 3);

		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

		for (String string : split) {
			System.out.println(string);
		}
	}

	private void Reverse(String str) {
		// TODO Auto-generated method stub

		String[] gs = str.split("");
		String rev = "";

		/*for (int i = 0; i < gs.length; i++) {
			String string = gs[i];
			System.out.println(string);

		}*/
		for (int i = gs.length-1; i >= 0; i--) {
			rev += gs[i];
		}

		System.out.println(rev);

	}
	private void Palindrome(String str) {
		// TODO Auto-generated method stub

		String[] gs = str.split("");
		String rev = "";

		/*for (int i = 0; i < gs.length; i++) {
			String string = gs[i];
			System.out.println(string);

		}*/
		for (int i = gs.length-1; i >= 0; i--) {
			rev += gs[i];
		}

		System.out.println(str + " : " + rev);

		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Given string " + str + " is palindrome");
		}
		else {
			System.out.println("Given string " + str + " is not palindrome");
		}

	}
	private void CheckString() {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter password");
		String p1 = sc1.nextLine();
		System.out.println("Enter confirm password");
		String p2 = sc1.nextLine();

		if(p1.equals(p2)) {
			System.out.println("Password correct");
		}
		else {
			System.out.println("Password incorrect");
		}
	}
	private void ValidEmail(String str) {
		// TODO Auto-generated method stub
		int indexOf = str.indexOf("@");
		if(indexOf >= 0) {
			System.out.println("Valid Email");
		}
		else {
			System.out.println("Invalid Email");
		}
	}
	private void Replace(String str) {
		// TODO Auto-generated method stub
		String replace = str.replace("java", "sql").replace(" ", "#");
		System.out.println(replace);

	}
	private void VowelsCount(String str) {
		// TODO Auto-generated method stub
		String[] split = str.toLowerCase().split("");
		int c1=0;
		int c2=0;
		for (int i = 0; i < split.length; i++) {

			if(split[i].contains("a") || split[i].contains("e") || split[i].contains("i") 
					|| split[i].contains("o") || split[i].contains("u")) {
				c1++;
				//System.out.println("here");
			}
			else {
				c2++;
			}
		}
		System.out.println("Vowels Count : " + c1 + "\nConsonants Count : " + c2);
	}
	private void ConvertChar(String str) {
		// TODO Auto-generated method stub		
		char[] charArray = str.toCharArray();
		String newStr="";

		for (int i = 0; i < charArray.length; i++) {
			if(Character.isLowerCase(charArray[i]))
				newStr += Character.toUpperCase(charArray[i]);
			else if(Character.isUpperCase(charArray[i]))
				newStr += Character.toLowerCase(charArray[i]);
			else
				newStr += charArray[i];
		}

		System.out.println(newStr);
	}
	private void ReplaceVowels(String str) {
		// TODO Auto-generated method stub
		String replace = str.replace("a", "@").replace("e", "@").replace("i", "@").replace("o", "@").replace("u", "@");
		System.out.println(replace);

	}
	public static void main(String[] args) {
		StringFun s1= new StringFun();
		//s1.StringFun1();

		//s1.Reverse("malayalam1");
		//s1.Palindrome("malayalam");
		//s1.CheckString();
		//s1.ValidEmail("kesa@test.com");
		//s1.Replace("Welcome to java class java");
		//s1.VowelsCount("Welcome");
		s1.ConvertChar("WelCome To Java");
		//s1.ReplaceVowels("Welcome to java class java");
	}
}
