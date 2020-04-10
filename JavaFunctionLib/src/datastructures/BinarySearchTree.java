package datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	
	public static void main(String[] args) {
		Node ro = new Node(10);
		ro.left = new Node(20);
		ro.right = new Node(30);
		ro.left.left = new Node(40);
		ro.left.left.left = new Node(60);
		ro.left.left.right = new Node(70);
		System.out.println(getHieghtOfTree(ro));
		inOrderTraversal(ro);
		System.out.println();
		postOrderTraversal(ro);
		System.out.println();
		preOrderTraversal(ro);
		System.out.println();
		levelOrderTraversal(ro);
	}
	
	static class Node{
		Node left;
		Node right;
		Integer value;
		public Node(Integer value) {
			this.left = null;
			this.right = null;
			this.value = value;
		}
	}
	
	// left -> root -> right
	public static void inOrderTraversal(Node root) {
		if(root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.value+" ");
			inOrderTraversal(root.right);
		}
	}
	
	// left -> right -> root
	public static void postOrderTraversal(Node root) {
		if(root != null) {
			inOrderTraversal(root.left);
			inOrderTraversal(root.right);
			System.out.print(root.value+" ");
		}
	}
	
	// root -> left -> right
	// Depth First Search
	public static void preOrderTraversal(Node root) {
		if(root != null) {
			System.out.print(root.value+" ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
			
		}
	}
	
	// Breath First Search
	public static void levelOrderTraversal(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		if(root != null) {
			queue.add(root);
		}
		while(!queue.isEmpty()) {
			Node level = queue.poll();
			System.out.print(level.value+" ");
			if(level.left != null) {
				queue.add(level.left);
			}
			if(level.right != null) {
				queue.add(level.right);
			}			
		}
	}
	
	
	public static int getHieghtOfTree(Node root) {
		if(root == null) {
			return -1;
		}
		return 1+Math.max(getHieghtOfTree(root.left), getHieghtOfTree(root.right));
	}

}
