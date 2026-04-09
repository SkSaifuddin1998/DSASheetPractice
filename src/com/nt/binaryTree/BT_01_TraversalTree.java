package com.nt.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class BT_01_TraversalTree {

	public static List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<Integer>();

		//inorderTree(root, list);
		//preOrderTree(root, list);
		postOrderTree(root, list);
		

		return list;
	}

	private static void inorderTree(TreeNode root, List<Integer> list) {
		if (root == null)
			return;

		inorderTree(root.left, list);
		list.add(root.val);
		inorderTree(root.right, list);
	}
	
	private static void preOrderTree(TreeNode root, List<Integer> list) {
		if (root == null)
			return;

		list.add(root.val);
		inorderTree(root.left, list);	
		inorderTree(root.right, list);
	}
	
	private static void postOrderTree(TreeNode root, List<Integer> list) {
		if (root == null)
			return;

		
		inorderTree(root.left, list);	
		inorderTree(root.right, list);
		list.add(root.val);
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		List<Integer> inorderTraversal = inorderTraversal(root);
		
		System.out.println("Inorder Traversal Tree is "+inorderTraversal);

	}

}
