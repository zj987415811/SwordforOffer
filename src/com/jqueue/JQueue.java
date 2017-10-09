package com.jqueue;

import java.util.Stack;

public class JQueue {
	private Stack<Integer> stack1=new Stack<>();
	private Stack<Integer> stack2=new Stack<>();
	public void appendTail(int element) {
		// TODO Auto-generated method stub
		stack1.push(element);
		System.out.println("stack1:"+stack1.toString());
	}
	public void deleteHead() {
		// TODO Auto-generated method stub
		if(!stack2.isEmpty()) {
			stack2.pop();
		}else if(!stack1.isEmpty()) {
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
			stack2.pop();
		}else {
			System.out.println("2¸öÕ»¶¼Îª¿Õ£¡");
		}
		System.out.println("stack1:"+stack1.toString());
		System.out.println("stack2:"+stack2.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JQueue testJQueue=new JQueue();
		testJQueue.appendTail(1);
		testJQueue.appendTail(2);
		testJQueue.appendTail(3);
		testJQueue.appendTail(4);
		testJQueue.deleteHead();
		testJQueue.appendTail(5);
		testJQueue.deleteHead();
	}

}
