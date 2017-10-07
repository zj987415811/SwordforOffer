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
				System.out.print(pListNode.value+"--��");
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
				temp.next=head.next;//����ڵ�
				head.next=temp;//����ڵ㲢�Ҹ�ֵ��
			}
			num++;
		}
		return head;
	}
	/***
	 * β�巨��
	 * 1.��ʼ��ͷ�������head������ָ��һ������
	 * 2.����2����ʱ������ã�temp,tail����head����tail��
	 * 3.ѭ�����룺��1����ListNode����ָ��temp���ã���ʱtemp��value=1;next=null;
	 * 			(2)��֤ͷ����Ƿ�Ϊ�գ����Ϊ�ս���ʱ����tempָ��tail,���ҽ�tailָ��ͷ����head.next.
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
		//System.out.println("ͷ�巨����������");
		System.out.println("β�巨����������");
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