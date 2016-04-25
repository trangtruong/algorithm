package com.algorithm.demo.delete;

public class LinkedList {
	
	Node head;
	class Node {
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
			next = null;
		}
	}
	
	void push(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}
	
	void deleteNode(int position) {
		if (head == null) return;
		
		Node temp = head;
		if (position == 0) head = temp.next;
		
		// Find previous node of node to be deleted.
		for (int i = 0; i < position -1; i++) {
			temp = temp.next;
		}
		
		Node next = temp.next.next;
		temp.next = next;
	}
	
	void printList() {
		Node tNode = head;
		while (tNode != null){
			System.out.println(tNode.val + ", ");
			tNode = tNode.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList nodes = new LinkedList();
		nodes.push(2);
		nodes.push(3);
		nodes.push(4);
		nodes.push(5);
		
		nodes.deleteNode(0);
		nodes.printList();
	}
}
