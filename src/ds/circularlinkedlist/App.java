package ds.circularlinkedlist;

public class App {

	public static void main(String[] args) {

		CircularLinkedList myList = new CircularLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(45);
		myList.insertFirst(123);
		myList.insertFirst(43);
		myList.insertFirst(1045);
		
		myList.insertLast(239293239);
		
		myList.displayList();
		
		myList.deleteFirst(); myList.displayList();
		
		//myList.deleteLast(); myList.displayList();
	}

}
