package com.printListReversing;

import java.util.List;

import com.sun.org.apache.bcel.internal.classfile.Node;

public class PrintListReversing {
	
}
class LinkList{
	public void addfirstNode(int data) {
		ListNode node=new ListNode(data);
		node.nextnode=first;
		first=node;
	}
	public void add(int index,int data) {
		ListNode tempnode=new ListNode(data);
		ListNode current=first;
	}
}
class ListNode{
	int data;
	ListNode nextnode;
	public ListNode(int data) {
		this.data=data;
		this.nextnode=null;
	}
}