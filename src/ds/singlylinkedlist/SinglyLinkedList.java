package ds.singlylinkedlist;

public class SinglyLinkedList {

	private Node first; // This will give the reference for the first node
	
	
	//constructor
	public SinglyLinkedList() {
		
	}
	
	 /**
	  * 
	  * @return whether this first node is equal to null
	  */
	public boolean isEmpty() {
		
		return (first == null);
	}
	
	/**
	 * This method will insert data at the begining of the list
	 * @param data
	 */
	public void inserFirst(int data) {
		Node newNode = new Node(); // creating the object node
		newNode.data = data; //setting input data as the data value of the newNode
		newNode.next = first; // the newNode will point to the old first
		first = newNode; // the first in the class will point to the newNode already created
	}
	
	/**
	 * This method will delete the first node of the list
	 * @return
	 */
	
	public Node deleteFirst() {
		Node temp = first; // Assign the current first Node
		first = first.next; // this will change the reference to the next value  and became garbage collection
		return temp;
	}
	
	public void displayList() {
		System.out.println("List (first --> last) ");
		
	}
	
}
