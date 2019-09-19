package ds.linkedLists;

public class App {

	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB = new Node();
		nodeB.data = 3;
		
		
		Node nodeC = new Node();
		nodeC.data = 7;
		
		Node nodeD = new Node();
		nodeD.data = 8; 
		
		nodeA.next = nodeB; // linking the nodes one after another , this point to the actual object that exist in the memory
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		
		
		System.out.println(listLength(nodeA)); // 4
		System.out.println(listLength(nodeB)); // 3
		 
	}
	
	public static int listLength(Node aNode) { // this method will return the length of the node
		int len = 0;
		Node currentNode = aNode; // point to the current node
		while(currentNode != null) {
			len++;
			currentNode = currentNode.next;
			
		}
		return len;
			
	}

}
