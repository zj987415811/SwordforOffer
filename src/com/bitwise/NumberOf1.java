package com.bitwise;

public class NumberOf1 {
	/***
	 * 不能处理负数；
	 * @param n
	 * @return
	 */
	public static int numberof1(int n) {
		int count=0;
			while(n>0) {
				if((n&1)!=0) {
					count++;
				}
				n=n>>1;
			}
		return count;
	}
	public static int numberof12(int n) {
		int count=0;
		int flag=1;
		while(flag!=0) {
				if((n&flag)!=0) {
					count++;
				}
				flag=flag<<1;
			}
		return count;
	}
	public static int numberof13(int n) {
		int count=0;
		
		while(n!=0) {
				count++;
				n=(n-1)&n;
			}
		return count;
	}
	public static void main(String[] args) {
		long startTime = System.nanoTime();    //获取开始时间
		NumberOf1.numberof1(1648749777);
		long endTime = System.nanoTime();  
		System.out.println("程序运行时间：" + (endTime - startTime) + "ns");    //输出程序运行时间
		long startTime1 = System.nanoTime();    //获取开始时间
		NumberOf1.numberof12(1648749777);
		long endTime1 = System.nanoTime();  
		System.out.println("程序运行时间：" + (endTime1 - startTime1) + "ns");    //输出程序运行时间
		long startTime2 = System.nanoTime();    //获取开始时间
		NumberOf1.numberof13(1648749777);
		long endTime2 = System.nanoTime();  
		System.out.println("程序运行时间：" + (endTime2 - startTime2) + "ns");    //输出程序运行时间
		
		
		
	}
}
