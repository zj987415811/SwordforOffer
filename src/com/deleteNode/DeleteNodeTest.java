package com.deleteNode;



public class DeleteNodeTest {
	static ListNode nodeList=null;
	
	@SuppressWarnings("null")
	public void deleteNode(ListNode pListHead,ListNode deleteNode) {
		if(pListHead==null||deleteNode==null) {
			return;
		}
		if(deleteNode.nextNode!=null) {
			ListNode pnext=deleteNode.nextNode;
			deleteNode.data=pnext.data;
			deleteNode.nextNode=pnext.nextNode;
		}else if(pListHead==deleteNode){
			deleteNode=null;
			pListHead.data=null;
			
		}else {
			ListNode temp=pListHead;
			while(temp.nextNode!=deleteNode) {
				temp=temp.nextNode;
			}
			temp.nextNode=null;
		}
	}
	public void add(int data) {
		ListNode temp=new ListNode(data);
		if(nodeList==null) {
			nodeList=temp;
			return;
		}
		ListNode temp2=nodeList;
		while(temp2.nextNode!=null) {
			temp2=temp2.nextNode;
		}
		temp2.nextNode=temp;
	}
	public void printLinkedList() {
		if(nodeList==null) return;
		ListNode temp=nodeList;
		System.out.println(nodeList.data);
		while(temp.nextNode!=null) {
			temp=temp.nextNode;
			System.out.println(temp.data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DeleteNodeTest().add(3);
		new DeleteNodeTest().printLinkedList();
		ListNode deleteNode=nodeList;
		new DeleteNodeTest().deleteNode(nodeList, deleteNode);
		new DeleteNodeTest().printLinkedList();
	}

}
