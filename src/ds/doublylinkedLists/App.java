package ds.doublylinkedLists;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList myList = new DoublyLinkedList();
		myList.insertFirst(23);
		myList.insertFirst(45);
		myList.insertFirst(2324);
		myList.insertFirst(4556);
		myList.insertFirst(23432);
		myList.insertFirst(456);
//		myList.insertLast(000);
//		myList.insertLast(1340);
//		myList.insertLast(1000);
		
		myList.displayForward();
		myList.displayBackward();
		
		myList.deleteFirst();
		//myList.deleteLast();
		myList.deleteKey(45);
		myList.insertAfter(2324, 4839);
		
		
		myList.displayBackward();
		myList.displayForward();

	}

}
