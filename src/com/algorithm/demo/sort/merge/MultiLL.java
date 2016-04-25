package com.algorithm.demo.sort.merge;

class MultLL {
	Node head;
 
	static class Node {
		int data;
		Node next;
 
		Node(int val) {
			data = val; next = null;
		}
	}
 
	public static void main(String[] args) {
		MultLL ll1 = new MultLL();
		MultLL ll2 = new MultLL();
		MultLL ll3 = new MultLL();
		add(ll1, 7);add(ll1, 15);add(ll1, 17);add(ll1, 36);add(ll1, 44);add(ll1, 67);
		add(ll2, 3);add(ll2, 9);add(ll2, 19);add(ll2, 49);
		print(ll1);print(ll2);
 
		mergeLLs(ll1, ll2);		//Merge LL1 and LL2
		print(ll1);
	}
 
	public static void add(MultLL ll, int val) {
		if (ll.head == null) {
			ll.head = new Node(val);
			ll.head.next = null;
			return;
		}
		Node temp = ll.head;
		while (temp.next != null) {
			temp = temp.next;
		}
		Node n = new Node(val);
		temp.next = n;
		n.next = null;
	}
 
	public static void print(MultLL ll) {
		if (ll.head == null) {
			return;
		}
		Node temp = ll.head;
		while (temp!=null) {
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.print("NULL");
		System.out.print("\n");
	}
 
	public static void mergeLLs(MultLL ll1, MultLL ll2) {
		Node iter1 = ll1.head;
		Node iter2 = ll2.head;
		Node head = null;
		if (ll1.head.data < ll2.head.data) {
			head = ll1.head;
			iter1=iter1.next;
		}
		else {
			head = ll2.head;
			iter2=iter2.next;
		}
		Node n = head;
		while (iter1!=null && iter2!=null) {
			if (iter1.data < iter2.data){
				n.next = iter1;
				iter1 = iter1.next;
			}
			else {
				n.next = iter2;
				iter2 = iter2.next;
			}
			n = n.next;
		}
		n.next = (iter1==null) ? iter2 : iter1;
		ll1.head = head;		
	}
}
