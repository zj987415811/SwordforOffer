package com.quicksort;

import java.util.Arrays;

public class Qsort {
	private void qsort(int a[],int left,int right) {
		if(a.length==0) {
			System.out.println("ÊäÈëÎª¿Õ£¡");
		}
		if(left>right) return;
		int i=left;
		int j=right;
		int key=a[left];
		while (i<j) {
			while(i<j&&key<=a[j]) {
				j--;
			}
			a[i]=a[j];
			while(i<j&&key>=a[i]) {
				i++;
			}
			a[j]=a[i];
		}
		a[i]=key;
		qsort(a, left, i-1);
		qsort(a, i+1, right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Qsort qsort=new Qsort();
		int array[]= {5,4,3,2,1};
		qsort.qsort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}

}
