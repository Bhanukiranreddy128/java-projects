package Bhanu128;

public class AVLTreeSimple {
	class Node{
		int key;
		int height;
		Node left,right;
		
		public Node(int value) {
			key=value;
			height=1;
		}
	}
	Node root;
	
	int height(Node n) {
		if(n==null) 
			return 0;
	   	    return n.height;
	}
	int getBalance(Node n) {
		if(n==null)
			return 0;
		return height(n.left)-height(n.right);
	}
	Node rightRotate(Node y) {
		Node x=y.left;
		Node T2=x.right;
		
		x.right=y;
		y.left=T2;
		
		y.height=Math.max(height(y.left), height(y.right))+1;
		x.height=Math.max(height(x.left), height(x.right))+1;
		return x;

	}
	Node leftRotate(Node x) {
		Node y=x.right;
		Node T2=y.left;
		
		y.left=x;
		y.right=T2;
		
		x.height=Math.max(height(x.left), height(x.right))+1 ;
		y.height=Math.max(height(y.left), height(y.right))+1;
		return y;

	}
	Node insert (Node node , int key) {
		if(node==null)
			return new Node(key);
		if(key < node.key)
			node.left=insert(node.left, key);
		else if (key < node.key)
			node.right=insert(node.right, key);
		else
			return node;
		
	node.height=1+Math.max(height(node.left), height(node.right));
	
	int balance = getBalance(node);
	if(balance > 1 && key < node.left.key)
		return rightRotate(node);
	if(balance< -1 && key > node.right.key)
		return leftRotate(node);
	if(balance > 1&& key > node.left.key) {
		node.left=leftRotate(node.left);
		return rightRotate(node);
	}
	if(balance < -1&& key < node.right.key) {
		node.right=rightRotate(node.right);
		return leftRotate(node);
	}
	return node;
	}
	
	void insert(int key) {
		root = insert(root, key);
	}
	void printInOrder(Node none) {
		if(none !=null)
			printInOrder(node.left);
		    System.out.println(node.key+" ");
		    printInOrder(node.right);
	}
	public static void main(String[] args) {
	AVLTreeSimple tree = new AVLTreeSimple();
	
	tree.insert(10);
	tree.insert(20);
	tree.insert(30);
	tree.insert(40);
	tree.insert(50);
	
	
}
}
