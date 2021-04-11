package com.employee.details;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
public class Collections {

	private void ArrayList() {
		
		// TODO Auto-generated method stub
		System.out.println("-----------ArrayList");
		List<Object> lst = new ArrayList<>();
		lst.add(100);
		lst.add(30);
		lst.add(40);
		lst.add("Test JAVA");
		//System.out.println(lst);
		lst.add(50);
		System.out.println(lst);
		lst.add(2, 60);
		System.out.println(lst);

		List<Object> lst1 = new ArrayList<>();
		lst1.add(1000);
		lst1.add(300);
		lst1.add(400);
		lst1.add("Test JAVA0");
		lst1.add(2000);
		lst.addAll(lst1);

		System.out.println(lst1);
		System.out.println(lst);

		List<Object> lst2 = new ArrayList<>();
		lst2.add(2000);
		lst2.add("Lst2");
		//lst.addAll(10, lst2);
		System.out.println("lst2 : " + lst2);

		boolean contains = lst.contains(5);
		System.out.println(contains);

		boolean containsAll = lst.containsAll(lst2);
		System.out.println(containsAll);

		Object object = lst.get(5);
		System.out.println(object);

		lst.set(0, "Set 0");
		System.out.println(lst);

		System.out.println(lst.get(0));
		/*
		lst.remove(5);
		System.out.println(lst);

		lst.retainAll(lst2);
		System.out.println(lst);*/
	}
	private void LinkedList() {
		// TODO Auto-generated method stub
		System.out.println("-----------ArrayList");
		List<Object> lst = new LinkedList<Object>();
		lst.add(100);
		lst.add(30);
		lst.add(40);
		lst.add("Test JAVA");
		System.out.println(lst);
		lst.add(50);
		System.out.println(lst);
		lst.add(2, 60);
		System.out.println(lst);

		List<Object> lst1 = new LinkedList<>();
		lst1.add(1000);
		lst1.add(300);
		lst1.add(400);
		lst1.add("Test JAVA0");
		lst1.add(2000);
		lst.addAll(lst1);

		System.out.println(lst1);
		System.out.println(lst);

		List<Object> lst2 = new ArrayList<>();
		lst2.add(2000);
		lst2.add("Lst2");
		//lst.addAll(10, lst2);
		System.out.println("lst2 : " + lst2);

		boolean contains = lst.contains(5);
		System.out.println(contains);

		boolean containsAll = lst.containsAll(lst2);
		System.out.println(containsAll);

		Object object = lst.get(5);
		System.out.println(object);

		lst.set(0, "Set 0");
		System.out.println(lst);

		lst.remove(5);
		System.out.println(lst);

		lst.retainAll(lst2);
		System.out.println(lst);

		lst.add(1, "LL1");
		lst.add(1, "LL3");
		lst.add(1, "LL2");
		System.out.println(lst);

		Object object2 = lst.get(2);
		System.out.println(object2);
		System.out.println(lst);
	}

	private void HashSet() {
		// TODO Auto-generated method stub
		Set<Object> lst = new java.util.HashSet<>();
		lst.add("10");
		lst.add("20");
		lst.add("30");
		lst.add("Java");
		lst.add(7);
		lst.add(7); 
		lst.add(8);
		lst.add(null);
		lst.add(null);
		boolean contains = lst.contains("Jav1a");
		lst.remove("20");
		System.out.println(lst);
		System.out.println(contains);
	}
	private void LinkedHashSet() {
		// TODO Auto-generated method stub
		Set<Object> lst = new java.util.LinkedHashSet<Object>();
		lst.add("10");
		lst.add("20");
		lst.add("30");
		lst.add("Java");
		lst.add(7);
		lst.add(7);
		lst.add(8);
		lst.add(null);
		lst.add(null);
		boolean contains = lst.contains("Jav1a");
		lst.remove("20");
		System.out.println(lst);
		System.out.println(contains);
	}
	private void TreeSet() {
		// TODO Auto-generated method stub
		Set<Object> lst = new java.util.TreeSet<>();
		lst.add(20);
		//lst.add("20");
		//lst.add("30");
		//lst.add("Java");
		lst.add(7);
		lst.add(7);
		lst.add(8);
		//lst.add(null);
		//lst.add(null);
		boolean contains = lst.contains(7);
		lst.remove(201);
		System.out.println(lst);
		System.out.println(contains);		
	}

	private void HashMap() {
		System.out.println("\n=================HashMap");
		Map<String, Object> lst = new HashMap<>();
		lst.put("Age", 33);
		lst.put("Name", "Kesavan");
		lst.put("Class", "Java");
		lst.put(null, "C++");
		lst.put(null, "C");
		System.out.println(lst);

		boolean containsKey = lst.containsKey("Age"); System.out.println(containsKey);
		boolean containsValue = lst.containsValue("Kesavan"); System.out.println(containsValue);
		//lst.remove("Name", "Kesavan");
		lst.remove("Agaaaaaaaaaaa");

		System.out.println(lst);

		System.out.println(lst.get("Name"));
		System.out.println(lst.get(null));
		
		lst.forEach((k,v) -> System.out.println("KEY : " + k + "\t   VALUE : " + v));
		
		Object object = lst.get("Name");
		System.out.println(object);
		System.out.println("=================");
		
		/*Description : Create a HashMap with the below key and values 
		 * 				and iterate it using enhanced for loop and get the key and values combination.
        key    : 10,20,30,40,50,60,10,50,40
        values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.*/
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();		
		m1.put(10, "java");
		m1.put(20, "sql");
		m1.put(30, "oops");
		m1.put(40, "Sql");
		m1.put(50, "oracle");
		m1.put(60, "DB");
		m1.put(10, "selenium");
		m1.put(50, "psql");
		m1.put(40, "Hadoop");
		
		System.out.println(m1);
		
		Set<Entry<Integer, String>> entrySet = m1.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
		
		
	}
	private void LinkedHashMap() {
		System.out.println("\n=================LinkedHashMap");
		Map<String, Object> lst = new LinkedHashMap<>();
		lst.put("Age", 33);
		lst.put("Name", "Kesavan");
		lst.put("Class", "Java");
		lst.put(null, "C+++");
		System.out.println(lst);

		boolean containsKey = lst.containsKey("Age"); System.out.println(containsKey);
		boolean containsValue = lst.containsValue("Kesavan"); System.out.println(containsValue);
		//lst.remove("Name", "Kesavan");
		lst.remove("Agaaaaaaaaaaa");

		System.out.println(lst);

		System.out.println(lst.get("Name"));

		Map lst1 = new java.util.LinkedHashMap<>();
		lst1.put("Std", "First Std");
		lst1.put("Blood", "A1 +");		
		lst.putAll(lst1);

		lst.replace("Std", "2nd Std");
		lst.replace("Std", "2nd Std1", "second std");

		lst.forEach((k,v) -> System.out.println("KEY : " + k + "\t   VALUE : " + v));
		//System.out.println("=================");
	}
	private void HashTable() {
		System.out.println("\n=================HashTable");
		Map<String, Object> lst = new Hashtable<>();
		lst.put("Age", 33);
		lst.put("Name", "Kesavan");
		lst.put("Class", "Java");
		lst.put("Class", "Java Prog");
		lst.put(null, "C++");
		System.out.println(lst);

		boolean containsKey = lst.containsKey("Age"); System.out.println(containsKey);
		boolean containsValue = lst.containsValue("Kesavan"); System.out.println(containsValue);
		//lst.remove("Name", "Kesavan");
		lst.remove("Agaaaaaaaaaaa");

		System.out.println(lst);

		System.out.println(lst.get("Name"));

		lst.forEach((k1,v1) -> System.out.println("KEY : " + k1 + "\t   VALUE : " + v1));
		//System.out.println("=================");
	}
	private void TreeMap() {
		System.out.println("\n=================TreeMap");
		Map<String, Object> lst = new TreeMap();
		lst.put("Age", 33);
		lst.put("Name", "Kesavan");
		lst.put("Class", "Java");
		lst.put("Class", "Java Prog");
		//lst.put(null, "C++");
		System.out.println(lst);

		boolean containsKey = lst.containsKey("Age"); System.out.println(containsKey);
		boolean containsValue = lst.containsValue("Kesavan"); System.out.println(containsValue);
		//lst.remove("Name", "Kesavan");
		lst.remove("Agaaaaaaaaaaa");

		System.out.println(lst);

		System.out.println(lst.get("Name"));

		lst.forEach((k,v) -> System.out.println("KEY : " + k + "\t   VALUE : " + v));
		//System.out.println("=================");
	}
	private void ConcurrentHashMap() {
		System.out.println("\n=================ConcurrentHashMap");
		Map<String, Object> lst = new ConcurrentHashMap<>();
		lst.put("Age", 33);
		lst.put("Name", "Kesavan");
		lst.put("Class", "Java");
		lst.put("Class", "Java Prog");
		lst.put(null, "C++");
		System.out.println(lst);

		boolean containsKey = lst.containsKey("Age"); System.out.println(containsKey);
		boolean containsValue = lst.containsValue("Kesavan"); System.out.println(containsValue);
		//lst.remove("Name", "Kesavan");
		lst.remove("Agaaaaaaaaaaa");

		System.out.println(lst);

		System.out.println(lst.get("Name"));

		lst.forEach((k,v) -> System.out.println("KEY : " + k + "\t   VALUE : " + v));
		//System.out.println("=================");
	}
	private void TaskMap1() {
		// TODO Auto-generated method stub
		String word="Twinkle Twinkle little star. Twinkle Like a diamond in the sky. little Star sky star.";
		String[] split = word.split(" ");

		Map<String, Integer> m1= new LinkedHashMap<String, Integer>();
		for (String w1 : split) {
			if(m1.containsKey(w1)) {
				int cntValue = m1.get(w1);
				m1.put(w1, cntValue + 1);
			}
			else
				m1.put(w1, 1);
		}

		System.out.println(m1);

		Set<Entry<String, Integer>> entrySet = m1.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			/*if(entry.getValue() >1) {
				System.out.println(entry);
			}*/

			if(entry.getKey().equals("Twinkle")) {
				System.out.println(entry);
			}
		}

	}

	private void Task2() {
		String sentence = "Hai how are you how about you";
		String[] split = sentence.split(" ");
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		
		for (String word : split) {
			if(m.containsKey(word))
			{
				int val = m.get(word);
				m.put(word, val+1);
			}
			else {
				m.put(word, 1);
			}
			//int val = m.getOrDefault(word,0);
			//m.put(word, val+1);
		}
		
		System.out.println(m);
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		//System.out.println(entrySet);
		for (Entry<String, Integer> entry : entrySet) {			
			if(entry.getValue()>1)
				System.out.println(entry);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array List
		Collections c = new Collections();
		//c.ArrayList();
		//c.LinkedList();

		//c.HashSet();
		//c.LinkedHashSet();
		//c.TreeSet();

		c.HashMap();
		//c.LinkedHashMap();
		//c.TreeMap();
		//c.HashTable();
		//c.ConcurrentHashMap();

		//c.TaskMap1();
		//c.Task2();
	}

}
