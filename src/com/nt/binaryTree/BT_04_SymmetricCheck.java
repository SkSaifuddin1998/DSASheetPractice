package com.nt.binaryTree;

public class BT_04_SymmetricCheck {

	public static boolean isSymmetric(TreeNode root) {

		if (root == null)
			return true;

		boolean checkStatus = checkStatus(root.left, root.right);

		return checkStatus;

	}

	private static boolean checkStatus(TreeNode root1, TreeNode root2) {
		// BASE CONDITION

		if (root1 == null && root2 == null)
			return true;

		if (root1 == null || root2 == null || root1.val != root2.val)
			return false;

		boolean a = checkStatus(root1.left, root2.right);
		boolean b = checkStatus(root1.right, root2.left);

		return a && b;
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(4);

		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);

		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);

		boolean symmetric = isSymmetric(root);

		System.out.println("Check The Symmetric Status  " + symmetric);

	}

}
