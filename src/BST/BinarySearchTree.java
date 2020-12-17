package BST;

public class BinarySearchTree {

	Node root;
	public BinarySearchTree() {
		root = null;
	}

	public void insert(int key) {
		root = insertRec(root,key);
	}
	
	
	/**
	 * Inserting a new node to the tree / or creating a new tree
	 * @param root
	 * @param key
	 * @return node 
	 */
	Node insertRec(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		
		if( key < root.data){
			root.left = insertRec(root.left, key);
		}else if(key > root.data) {
			root.right = insertRec(root.right, key);
		}
			
		
		return root;
	}
	
	public void inOrder() {
		inOrderRec(root);
	}
	
	public void inOrderRec(Node root) {
		if(root != null) {
			inOrderRec(root.left);
			System.out.println(root.data);
			inOrderRec(root.right);
		}
	}
	
	public int minValue(Node node) {
		Node current = node;
		int track = 0;
		while(current.left != null) {
			current = current.left;
			track ++;
		}
//		System.out.println("min track: "+ track);
		return current.data;
	}
	
	public int maxValue(Node node) {
		int track = 0;
		Node current = node;
		while(current.right != null) {
			current = current.right;
			track ++;
		}
//		System.out.println("max track: "+ track);
		return current.data;
	}
	
	
	public static  int bSTlength(BinarySearchTree bst) {
	    int trackMin = 1;
	    int trackMax = 1;
	    Node current = bst.root;
	    while(current.right != null) {
	    	current = current.right;
	    	trackMax ++;
	    }
	    current = bst.root;
	    while(current.left != null) {
	    	current = current.left;
	    	trackMin ++;
	    }
	    System.out.println(Math.max(trackMin, trackMax));
		return Math.max(trackMin, trackMax);
		
	}
	
	
	 public static void main(String[] args) 
	    { 
		 BinarySearchTree tree = new BinarySearchTree();
		 tree.insert(50);
		 tree.insert(55);
		 tree.insert(40);
		 tree.insert(410);
		 tree.insert(402);
		 tree.insert(401);
		 tree.insert(500);
		 tree.insert(490);
		
		 System.out.println("Tree root = " + tree.root.data);
		 
		 tree.inOrder();
		 System.out.println("Min = "+tree.minValue(tree.root));
		 
		 System.out.println("Max = "+tree.maxValue(tree.root));
		 bSTlength(tree);
	    }
	 
}
