package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		Demo d = new Demo();
		//d.testDemo();
		//d.testPalindrome();
	}
	public void testDemo() {
		String sente="Forms of cricket range from Twenty20, with each team batting for a single innings of 20 overs, to Test matches played over five days. Traditionally cricketers play in all-white kit, but in limited overs cricket they wear club or team colours. In addition to the basic kit, some players wear protective gear to prevent injury caused by the ball, which is a hard, solid spheroid made of compressed leather with a slightly raised sewn seam enclosing a cork core layered with tightly wound string.";
		sente = sente.replaceAll("[^a-zA-Z0-9] ", "");
		
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		String[] split = sente.split(" ");
		for (String word : split) {			
			Integer int1 = m1.getOrDefault(word, 0);
			m1.put(word, int1+1);
		}
		
		Set<Entry<String, Integer>> entrySet = m1.entrySet();
		
		List<String> lst1 = new ArrayList<String>();
		List<String> lst2 = new ArrayList<String>();
		
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue().equals(1)) {
				lst1.add(entry.getKey());
			}
			if(entry.getValue() > 1) {
				lst2.add(entry.getKey());
			}
		}
		
		System.out.println("With Out Duplicate : ");
		for (String string : lst1) {
			System.out.println(string);
		}
		System.out.println("---------------------");
		System.out.println("With Duplicate : ");
		for (String string : lst2) {
			System.out.println(string);
		}
		/*if(m1.containsKey(word))
		{
			Integer integer = m1.get(word);
			m1.put(word, integer + 1);
		}
		else
			m1.put(word, 1);*/
	}

	public void testPalindrome() {
		int ori = 15513, i=0, j=0, test = ori;
		while(ori>0) {
			i=ori % 10;
			j=(j*10) + i;
			ori = ori/10;
		}		
		if(test == j)System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
	}
	
	private void dempFB() {
		// TODO Auto-generated method stub

	}
}
