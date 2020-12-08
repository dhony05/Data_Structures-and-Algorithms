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
			root.right = insertRec(root.left, key);
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
	
	
	 public static void main(String[] args) 
	    { 
		 BinarySearchTree tree = new BinarySearchTree();
		 tree.insert(50);
		 tree.insert(55);
		 tree.insert(40);
		 System.out.println("Tree root = " + tree.root.key);
		 
		 tree.inOrder();
	    }
}
