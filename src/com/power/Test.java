package com.power;

public class Test {
	public void PrintlT0maxOfNDigits(int n) {
		if(n<=0) {
			System.out.println("ÊäÈëÓÐÎó£¡");
			return;
		}
		print("", n);
	}
	public void print(String str,int len) {
		// TODO Auto-generated method stub
		if(len==0) {
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)!='\0') {
					System.out.println(str.substring(j));
					break;
				}
			}
			return;
		}
		for(int i=0;i<10;i++) {
			print(str+i, len-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		test.PrintlT0maxOfNDigits(3);
	}

}
