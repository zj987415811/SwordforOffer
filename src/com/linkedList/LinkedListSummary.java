package com.linkedList;
public class LinkedListSummary{
	ListNode head=null;
	public static int LenofList(ListNode head) {
		if(head==null)
			return 0;
		int count =0;
		while(head.next!=null) {
			count++;
			head=head.next;
		}
		return count;
	}
	public static void display(ListNode head) {
		if(head==null) return;
		ListNode pListNode=head.next;
		while(pListNode!=null) {
			if(pListNode.next!=null) {
				System.out.print(pListNode.value+"--》");
			}else {
				System.out.print(pListNode.value);
			}
			pListNode=pListNode.next;
		}
	}
	public static ListNode MakeListFromHead(int[] arr,int len) {
		if(len<=0) return null;
		ListNode head=new ListNode(0);
		ListNode temp;
		int num=0;
		while(num<len) {
			temp=new ListNode(arr[num]);
			if(head.next==null) {
				head.next=temp;
			}else {
				temp.next=head.next;//插入节点
				head.next=temp;//插入节点并且赋值；
			}
			num++;
		}
		return head;
	}
	/***
	 * 尾插法：
	 * 1.初始化头结点引用head，并且指向一个对象；
	 * 2.建立2个临时结点引用，temp,tail，将head赋给tail；
	 * 3.循环插入：（1）将ListNode对象指向temp引用，此时temp中value=1;next=null;
	 * 			(2)验证头结点是否为空，如果为空将临时引用temp指向tail,并且将tail指向头结点的head.next.
	 * 			
	 * @param arr
	 * @param len
	 * @return
	 */
	public void MakeListFromTail(int data) {
		ListNode newlistnode=new ListNode(data);
		if(head==null) {
			head=newlistnode;
			return;
		}
		ListNode temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newlistnode;
	}
	public static void main(String[] args) {
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=i+1;
		}
		//System.out.println("头插法创建单链表：");
		System.out.println("尾插法创建单链表：");
		//ListNode listNode=MakeListFromHead(arr, 10);
		//ListNode listNode=
		//System.out.println();
	}
}
class ListNode{
	public int value;
	public ListNode next;
	public ListNode(int value) {
		// TODO Auto-generated constructor stub
		this.value=value;
		this.next=null;
	}
}