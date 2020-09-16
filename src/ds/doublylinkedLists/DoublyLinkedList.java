package ds.doublylinkedLists;

import ds.singlylinkedlist.Node;

public class DoublyLinkedList {

	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
		
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode; // if empty, last will refer to the new Node being created
		}else {
			first.previous = newNode;
		}
		
		newNode.next = first; // newNode will point to the old first;
		this.first = newNode;
	}
	
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		}else {
			last.next = newNode; //newNode will point to the old last
			newNode.previous = last; // old last will be newNode previous
		}
		last = newNode; //the last field should point to the new node
		  
	}
	
	
	// assumming is a non empty list
	public Node deleteFirst() {
		Node temp = first;
		
		if(first.next == null ) { // there is only one item on list
			last = null;
		}else {
			first.next.previous = null; // will go back to the reference of null 
		}
		
		first = first.next; // in this case will jump over the current node to point to the next one
		
		return temp; // return the deleted old first node
	}
	
	
	// Assuming is not empty
	
	public Node deleteLast() {
		Node temp = last;
		
		if(first.next == null) {// if we only have one node
			first = null;
		}else {
			last.previous.next = null; // the last node previous node's fiel will point to null
		}
		
		last = last.previous;
		return temp;
		
	}
	
	// Assuming non-empty list
	public boolean insertAfter(int key,int data) { // key data we are looking for to insert after 
		Node current = first; // we start from the begining of the list
		while(current.data != key) { // as long as we have not found the key in a particular node
			current = current.next;
			if(current == null) { // if doesn't find the key in the list then return false
				return false;
			}
			
		}
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(current == last) {
			current.next = null;
			last = newNode;
		}else {
			newNode.next = current.next;// new Node's next field should point to the node ahead of the current node
			current.next.previous = newNode;
			// the node ahead of current , its previous field should point to the new node
		}
		
		newNode.previous = current; // the node we inserted should point to old current 
		current.next = newNode;
		
		return true;
	}
	
	// assume non-empty list
	
	public Node deleteKey(int key) {
		Node current = first; // starting from begining
		
		while(current.data !=key) {
			current = current.next;
			if(current == null) {
				return null;
			}
		}
		if(current == first) {
			first = current.next; // if is the first node then change the reference to next node after first
			
		}else {
			current.previous.next = current.next; // form A
		}
		
		if(current == last ) {
			last = current.previous;
			
		}else {
			current.next.previous = current.previous; // form B
		}
		
		return current;
	} 
	
	public void displayForward() {
		System.out.println("List (first --> last) ");
		Node current = first;
		while(current != null) { // remember the last node point to null 
			current.displayNode();
			current = current.next;// move to the next node 
			
		}
		System.out.println();
	}
	
	public void displayBackward() {
		System.out.println("List (last --> first) ");
		Node current = last;
		while(current != null) { // remember the last node point to null 
			current.displayNode();
			current = current.previous;
			
		}
		System.out.println();
	}
	
	
	
}
