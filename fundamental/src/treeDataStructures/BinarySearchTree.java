package treeDataStructures;

public class BinarySearchTree {
	private Node root;

	public void add(int data) {
		root = insert(root, data);
	}

	private Node insert(Node root, int data) {
		Node newNode = new Node(null, data, null);
		if (root == null) {
			return newNode;
		}
		if (root.key > data) {
			root.left = insert(root.left, data);
		} else if (root.key <= data) {
			root.right = insert(root.right, data);
		}
		return root;

	}

	public void printInorder() {
		printInorderHelper(root);
	}

	public void printInorderHelper(Node root) {
		if (root != null) {
			printInorderHelper(root.left);
			System.out.println(root.key + " ");
			printInorderHelper(root.right);
		}
	}

//	public Node deleteHelper(Node root, int data) {
//      if(root==null) {
//    	  return null;
//      }if(data<root.key) {
//    	  root.left=deleteHelper(root.left, data);
//      }else if(data>root.key) {
//    	  root.right=deleteHelper(root.right, data);
//      }else {
//    	  if(root.left!=null);
//      }
//	}

	public void delete(int data) {

	}

	public static class Node {
		Node left;
		Node right;
		int key;

		public Node(Node left, int key, Node right) {
			this.left = left;
			this.right = right;
			this.key = key;

		}

	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(10);
		bst.add(20);
		bst.add(30);
		bst.add(4);
		bst.add(2);
		bst.add(80);
		bst.printInorder();
	}

}
