package com.printListReversing;

public class LinkedListReverse {
	public static ListNode head=null;
	public static void main(String[] args) {
		LinkedListReverse linkedListReverse=new LinkedListReverse();
		linkedListReverse.add(1);
		linkedListReverse.add(2);
		linkedListReverse.add(3);
		linkedListReverse.add(4);
		linkedListReverse.reverseList(head);
	}
	public ListNode reverseList(ListNode listNode) {
		if(listNode==null) return listNode;
//		ListNode pNode=listNode;
//		ListNode pPrev=null;
//		ListNode reListNodehead=null;
//		while(pNode.nextnode!=null) {
//			ListNode pNext=pNode.nextnode;
//			if(pNext.nextnode==null) {
//				reListNodehead=pNode;
//			}
//			pNode.nextnode=pPrev;
//			pPrev=pNode;
//			pNode=pNext;
//		}
		
		ListNode temp=listNode;
		ListNode temp2=null;
		ListNode temp4=null;
		while(temp!=null) {
			ListNode temp3=temp.nextnode;//局部变量来存值，否则会因为引用传递而改变所有值。
			if(temp3==null) {
				temp4=temp;
			}
			temp.nextnode=temp2;
			temp2=temp;
			temp=temp3;
		}
		return temp4;
	}
	public void add(int data) {
		// TODO Auto-generated method stub
		ListNode temp=new ListNode(data);
		if(head==null) {
			head=temp;
			return;
		}
		ListNode tListNode=head;
		while(tListNode.nextnode!=null) {
			tListNode=tListNode.nextnode;
		}
		tListNode.nextnode=temp;
		
	}
}
