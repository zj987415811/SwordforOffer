package com.quicksort;

public class QuickSort {
	public int Partition(int data[],int length,int start,int end) {
		if(data==null||length<=0||start<0||end>=length) {
			System.out.println("Invalid Parameters!");
		}
		int index=(int)(Math.random()*(end-start))+start;
		Swap(data[index], data[end]);
		int small=start-1;
		for(index=start;index<end;++index) 
		{
			if(data[index]<data[end]) 
			{
				++small;
				if(small!=index) 
				{
					Swap(data[index], data[small]);
				}
			}
		}
		small++;
		Swap(data[small], data[end]);
		return small;
	}
	public void QuickSort1(int data[],int length,int start,int end) {
		// TODO Auto-generated constructor stub
		if(start==end) return;
		int index=Partition(data, length, start, end);
		if(index>start)
			QuickSort1(data, length, start, index-1);
		if(index<end) {
			QuickSort1(data, length, index+1, end);
		}
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
	}
	public static void main(String[] args) {
		int arr[]= {3,4,7,10,13,15,14,20,1,6};
		int length=arr.length;
		int start=0;
		int end=arr.length-1;
		QuickSort quickSort=new QuickSort();
		quickSort.QuickSort1(arr, length, start, end);
	}
	public void Swap(int a,int b) {
		int c;
		c=b;
		b=a;
		a=c;
	}
}
