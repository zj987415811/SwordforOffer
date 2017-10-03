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
		}
		return found;
	}
	public static void main(String[] args) {
		int[] matrix= {1,2,3,4,
				2,3,4,5,
				3,4,5,6,
				4,5,6,7,
				};
		int num=7;
		int x=4;
		int y=4;
		FindNum findNum=new FindNum();
		System.out.println(findNum.findnum(num, matrix, x, y)
		);
	}
	
}
