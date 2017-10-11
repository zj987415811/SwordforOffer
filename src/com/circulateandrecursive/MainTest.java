package com.circulateandrecursive;

import com.main.Main;

public class MainTest {
	static public void circulate() {
		int sum=0;
		int i=0;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		MainTest.circulate();
		System.out.println(MainTest.recursive(50000));
	}
	static int recursive(int n) {
		// TODO Auto-generated method stub
		
		return n<=0?0:n+recursive(n-1);
	}
}
