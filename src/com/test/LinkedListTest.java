package com.test;

import java.util.List;
import java.util.Stack;

import sun.security.util.Length;

public class LinkedListTest {
	ListNode head=null;
	public void add(int value) {
		// TODO Auto-generated method stub
		ListNode newnode=new ListNode(value);
		if(head==null) {
			head=newnode;
			return;
		}
		ListNode temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
}
	public void display(){
		if(head==null) {
			return;
		}
		ListNode temp=head;
		while(temp!=null) {
			System.out.print(temp.value+"");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListTest linkedListTest=new LinkedListTest();
		linkedListTest.add(1);
		linkedListTest.add(2);
		linkedListTest.add(3);
		linkedListTest.add(4);
		linkedListTest.add(5);
		linkedListTest.display();
		linkedListTest.PrintreverseList();
	}
	public int length() {
		int length=0;
		ListNode temp=head;
		while(temp!=null) {
			length++;
			temp=temp.next;
		}
		return length;
	}
	public boolean deleteNode(int index) {
		if(index<1||index>length()) {
			return false;
		}
		if(index==1) {
			head=head.next;
			return true;
		}
		int i=1;
		ListNode preNode=head;
		ListNode curNode=preNode.next;
		while(curNode!=null) {
			if(i==index) {
				preNode.next=curNode.next;
				return true;
			}
			preNode=curNode;
			curNode=curNode.next;
			i++;
		}
		return false;
	}
	public void PrintreverseList() {
//		ListNode prev=null;//前一个节点
//		while(head!=null) {
//			ListNode temp=head.next;
//			head.next=prev;
//			prev=head;
//			head=temp;
//			}
//		if(prev==null) {
//			return;
//		}
//		ListNode temp=prev;
//			while(temp!=null) {
//				System.out.print(temp.value+"");
//				temp=temp.next;
//			}
//		}
//		if(head==null) {
//			return head;
//		}
//		ListNode pre=head;
//		ListNode cur=head.next;
//		ListNode temp;
//		while(cur!=null) {
//			temp=cur.next;
//			cur.next=pre;
//			pre=cur;
//			cur=temp;
//		}
//		return head;
		Stack<Integer>stack=new Stack<Integer>();
		ListNode pListNode=head;
		while(pListNode!=null) {
			stack.push(pListNode.value);
			pListNode=pListNode.next;
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
		System.out.println();
		}
	public void PrintreverseList2() {
		if(head!=null) {
			if(head.next!=null) {
				
				PrintreverseList2();
			}
			ListNode temp=head;
			while(temp!=null) {
				System.out.print(temp.value+"");
				temp=temp.next;
			}
			
		}
	}
}

class ListNode{
	int value;
	ListNode next;
	public ListNode(int value) {
		// TODO Auto-generated constructor stub
		this.value=value;
		this.next=null;
	}
}