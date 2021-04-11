package com.employee.details;

public class PostPreIncrement {
static {
	System.out.println("================== 1. Post / Pre Increment");
}
	PostPreIncrement(){
		//System.out.println("Post / Pre Increment");
		
		int i=10;		
		i++; //10
		//System.out.println(i);
		i++; //11
		++i; //13
		++i; //14
		i++; //14
		i++; //15
		//i += 2;
		System.out.println(i++ + ++i); //16 + 18 = 34
		
		System.out.println("==================");
		
		int j=25;		
		j++; //25
		j++; //26
		++j; //28
		j++; //28
		++j; //30
		j++; //30
		j++; //31
		System.out.println(++j + j++); //33 + 33 = 66
		System.out.println("==================");
	}
	static {
		System.out.println("================== 2. Post / Pre Increment");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostPreIncrement p1= new PostPreIncrement();
	}

}
