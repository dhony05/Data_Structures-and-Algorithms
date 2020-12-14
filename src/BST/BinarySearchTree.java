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
		
		if( key < root.key){
			root.left = insertRec(root.left, key);
		}else if(key > root.key) {
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
			System.out.println(root.key);
			inOrderRec(root.right);
		}
	}
	
	public int minValue(Node node) {
		Node current = node;
		while(current.left != null) {
			current = current.left;
		}
		
		return current.key;
	}
	
	public int maxValue(Node node) {
		Node current = node;
		while(current.right != null) {
			current = current.right;
		}
		
		return current.key;
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
		
		 System.out.println("Tree root = " + tree.root.key);
		 
		 tree.inOrder();
		 System.out.println("Min = "+tree.minValue(tree.root));
		 
		 System.out.println("Max = "+tree.maxValue(tree.root));
	    }
}
