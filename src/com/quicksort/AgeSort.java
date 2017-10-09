package com.quicksort;

public class AgeSort {
	public void SortAges(int ages[],int length) {
		if(ages==null||length<=0) 
		{
			return;
		}
		final int oldestAge=99;
		int[]timesOfAge=new int[oldestAge+1];
		for(int i=0;i<oldestAge;i++) {
			timesOfAge[i]=0;
		}
		for(int i=0;i<length;i++) {
			int age=ages[i];
			if(age<0||age>oldestAge)
				System.out.println("age out of range.");
			timesOfAge[age]++;
		}
		int index=0;
		for(int i=0;i<=oldestAge;i++) {
			for(int j=0;j<timesOfAge[i];j++) {
				ages[index]=i;
				index++;
			}
		}
		
	}
	static Integer printMin(int array[]) {
		int low=0;
		int end=array.length-1;
		if(array.length==0) return null;
		while(low<end) {
			int mid=(low+end)/2;
			if(array[mid]>array[end]) {
				low=mid+1;
			}else if(array[mid]==array[end]) {
				end=end-1;
			}else {
				end=mid;
			}
		}
		return array[low];
	}
	static Integer printMin1(int array[]) {
		int low=0;
		int end=array.length-1;
		if(array.length==0) return null;
		while(low<end) {
			int mid=(low+end)/2;
			if(array[mid]>array[end]) {
				low=mid;
			}else if(array[mid]<array[end]) {
				end=mid;
			}
		}
		return array[low];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test[]= {6,7,8,1,2,3,4,5};
		System.err.println(printMin1(test));
	}

}
