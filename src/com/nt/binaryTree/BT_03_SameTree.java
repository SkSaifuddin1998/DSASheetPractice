package com.nt.binaryTree;

public class BT_03_SameTree {
	
	 public static boolean isSameTree(TreeNode p, TreeNode q) {
		 
	       //BASE CONDITION
		 if(p==null && q==null) return true;
		 
		 if(p==null || q==null || p.val!=q.val ) return false;
		 
		 return isSameTree(p.left, q.left) && isSameTree(p.left, q.left);
	 }
		 
		 

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		
		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(3);
		
		boolean sameTree = isSameTree(root1, root2);
		
		System.out.println("Check Status :"+sameTree);
		
		

	}

}
