/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.reorderOddEven;
public class ReorderOddEven{
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		ReorderOddEven.reorderOddEven(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}
	static public void reorderOddEven(int[] arr) {
		if(arr.length==0) return;
		int i=0;
		int j=arr.length-1;
		int start=arr[i];
		int end=arr[j];
		while(i<j) {
			while(i<j&&(start&0x01)!=0) {
				i++;
				start=arr[i];
			}
			while(i<j&&(end&0x01)==0) {
				j--;
				end=arr[j];
			}
			if((start&0x01)==0&&((end&0x01)!=0)) {
				int temp;
				temp=end;
				end=start;
				start=temp;
			}
			arr[i]=start;
			arr[j]=end;
		}
		
	}
	
}