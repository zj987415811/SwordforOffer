package Linklist;

import java.util.Scanner;

public class LinkedListSummary {
	public static class Node{
		int value;
		Node next;
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.value=data;
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Node head=null;
		if(in.hasNextInt()) {
			head=new Node(in.nextInt());
		}
		Node temp=head;
		while(in.hasNextInt()) {
			temp.next=new Node(in.nextInt());
			
		}
	}
}
