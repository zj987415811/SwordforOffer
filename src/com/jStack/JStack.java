package com.jStack;

import java.util.LinkedList;
import java.util.Queue;

public class JStack {
	private Queue<Integer> queue1=new LinkedList<>();
	private Queue<Integer> queue2=new LinkedList<>();
	public void appendtail(int element) {
		if(!queue2.isEmpty()) {
			queue2.offer(element);
		}else {
			queue1.offer(element);
		}
		System.out.println("queue1"+queue1.toString());
		System.out.println("queue2"+queue2.toString());
	}
	public void deleteHead() {
		Queue<Integer> emptyQueue=queue1;
		Queue<Integer> noemptyQueue=queue2;
		if(!queue1.isEmpty()) {
			emptyQueue=queue2;
			noemptyQueue=queue1;
		}
		while(noemptyQueue.size()!=1) {
			emptyQueue.offer(noemptyQueue.poll());
		}
		noemptyQueue.poll();
		System.out.println("queue1:"+queue1.toString());
		System.out.println("queue2:"+queue2.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JStack jStack=new JStack();
		jStack.appendtail(1);
		jStack.appendtail(2);
		jStack.appendtail(3);
		jStack.deleteHead();
		jStack.deleteHead();
	}

}
