package com.findnum;

public class FindNum {
	public boolean findnum(int num,int[] matrix,int x,int y) {
		boolean found=false;
		if(matrix!=null&&x>0&&y>0) {
			int row=0;
			int column=y-1;
			while(row<x&&column>=0) {
				if(matrix[row*y+column]==num) {
					found=true;
					break;
				}
				else if(matrix[row*y+column]>num) {
					--column;
				}else if(matrix[row*y+column]<num) {
					++row;
				}
			}
		}else {
			System.out.println("Êý×éÓÐÎó£¡");
		}
		return found;
	}
	
	
}
