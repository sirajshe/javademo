public class BinarySearchTree {
	TreeNode root;
	class TreeNode {
		TreeNode left,right;
		int data;
	
		public TreeNode(int value) {
			this.data=value;
			left=right=null;
		}
	}

	public void insert(int data) {
		root = insertRec(root, data);
	}

	public TreeNode insertRec(TreeNode root, int value) {
		if (root == null) {
			root=new TreeNode(value);
		}
		if (value < root.data) {
			root.left = insertRec(root.left,value);
		}

		if (value > root.data) {
			root.right = insertRec(root.right,value);
		}
		return root;
	}
	static boolean contains(TreeNode root, int data) {
		//System.out.println("root="+root);
		if (root==null)
			return false;
		
		if (root.data == data)
			return true;

		if (data < root.data)
			return contains(root.left, data);
		else
			return contains(root.right, data);
	}

	void remove(int data) {
		root=removeRec(this.root,data);
	}

	TreeNode removeRec(TreeNode root, int data) {
		if (root == null)
			return root;

		if (data > root.data) {
			removeRec(root.right, data);
		} else if (data < root.data) {
			removeRec(root.left,data);
		} else {

			// data == root.data, ie. the node to delete.
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
		}

		// node with two children: Get the inorder successor (smallest 
            	// in the right subtree) 
            	//root.data = minValue(root.right); 
  
            	// Delete the inorder successor 
	        //root.right = removeRec(root.right, root.data); 

		return root;	
        }

	// This is a balanced binary tree, so the leftmost value is always the min.
	int minValue(TreeNode root) { 
        	int minv = root.data; 
        	while (root.left != null) { 
            		minv = root.left.data; 
            		root = root.left; 
        	} 
        	return minv; 
	} 

	void inorder() {
		inOrderRec(root);
	}

	static void inOrderRec(TreeNode root) {
		if (root == null)
			return;

		inOrderRec(root.left);
		System.out.println(root.data);
		inOrderRec(root.right);
	}

	
	public static void main(String[] s) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(25);
		bst.insert(15);
		bst.insert(12);
		bst.insert(8);
		bst.insert(14);
		bst.inorder();
		System.out.println("Return = "+contains(bst.root,15));
		bst.remove(15);
		bst.inorder();
	}
}
