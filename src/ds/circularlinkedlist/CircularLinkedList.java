package ds.circularlinkedlist;

import ds.singlylinkedlist.Node;

public class CircularLinkedList {
	
	private Node first;
	private Node last;
	
	
	public CircularLinkedList() {
		first = null;
		last = null;
	}
	// We are implementing almost the same procedures but with a little be of changes
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) { // will check if is empty and if empty last will point newNode making it circular
			last = newNode;
		}
		
		newNode.next = first;  // this newNode will point to the old first
		first = newNode;  // first place
	}
	private boolean isEmpty() {
		
		return first == null;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data ; 
		
		if(isEmpty()) {
			first = newNode;
		}
		
		else {
			last.next = newNode; // next value of the last node will point to newNode
		    last = newNode; // old last will point to the newNode because it became the last node
			
		}
	}
	
	public int deleteFirst() {
		int temp = first.data;
		
		if(first.next == null) { // if we deleting everything both will point to null
			last = null;
		}
		
		first = first.next; // first will point to old's next value
		return temp; 
	}
	 // need to be fixed
	// cannot do it because need to know previous for this 
//	public int deleteLast() {
//		int temp = last.data;
//		if(last.next == null ) {
//			first = null;
//		}
//		
//		last = last.next;
//		return temp;
//	}
//	
	
	public void displayList() {
		System.out.println("List (first --> last) ");
		Node current = first;
		while(current != null) { // remember the last node point to null 
			//snapshot basically
			current.displayNode();
			current = current.next;
			
		}
		System.out.println();
	}
	
	
	

}
