package com.circulateandrecursive;


public class Fibonacci {
	public int fibonacci1(int n) {
		
		if(n<=0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fibonacci1(n-1)+fibonacci1(n-2);
		
	}
	public long fibonacci2(int n) {
		int[] result= {0,1};
		if(n<2) {
			return result[n];
		}
		long fibNminusOne=0;
		long fibNminusTwo=1;
		long fibN=0;
		for(int i=2;i<n;i++) {
			fibN=fibNminusOne+fibNminusTwo;
			fibNminusTwo=fibN;
			fibNminusOne=fibNminusTwo;
		}
		return fibN;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new Fibonacci().fibonacci2(50));
		
	}

}
