package ds.singlylinkedlist;

public class Node {
	
	public int data; 
	public Node next;
	public Node previous;
	
	/*
	 * This method will display what is inside the previous variables 
	 * SynglyLinkedList is single directional and cannot go backward
	 */
	public void displayNode() {
		System.out.println("{ "+ data +" }");
	}
	
	
	

}
