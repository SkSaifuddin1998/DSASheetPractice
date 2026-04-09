package com.nt.binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BT_02_UniqueBinarySearchTree {
	
	static Map<String, List<TreeNode>> memo = new HashMap<>();

	private static List<TreeNode> generateTrees(int n) {

		return n > 0 ? build(1, n) : new ArrayList<TreeNode>();
	}

	private static List<TreeNode> geenrateTree(int start, int end) {
		List<TreeNode> result = new ArrayList<TreeNode>();

		// base condition
		if (start > end) {
			result.add(null);
			return result;
		}

		//
		for (int i = start; i <= end; i++) {
			List<TreeNode> leftTree = geenrateTree(start, i - 1);
			List<TreeNode> rightTree = geenrateTree(i + 1, end);

			for (TreeNode l : leftTree) {
				for (TreeNode r : rightTree) {
					TreeNode currNode = new TreeNode(i);
					currNode.left = l;
					currNode.right = r;
					result.add(currNode);
				}
			}
		}

		return result;

	}
	
	 private static List<TreeNode> build(int start, int end) {

	        String key = start + "-" + end;

	        // 🔹 If already computed, return from memo
	        if (memo.containsKey(key)) {
	            return memo.get(key);
	        }

	        List<TreeNode> result = new ArrayList<>();

	        // Base case
	        if (start > end) {
	            result.add(null);
	            return result;
	        }

	        // Try each value as root
	        for (int i = start; i <= end; i++) {

	            List<TreeNode> leftTrees = build(start, i - 1);
	            List<TreeNode> rightTrees = build(i + 1, end);

	            for (TreeNode left : leftTrees) {
	                for (TreeNode right : rightTrees) {
	                    TreeNode root = new TreeNode(i);
	                    root.left = left;
	                    root.right = right;
	                    result.add(root);
	                }
	            }
	        }

	        // 🔹 Store in memo
	        memo.put(key, result);
	        return result;
	    }

	
	private static void printTree(TreeNode root) {
	    if (root == null) {
	        System.out.print("null ");
	        return;
	    }

	    System.out.print(root.val + " ");
	    printTree(root.left);
	    printTree(root.right);
	}

	public static void main(String[] args) {

		List<TreeNode> treeNode = generateTrees(5);
		
		 int count = 1;
		    for (TreeNode root : treeNode) {
		        System.out.print("Tree " + count++ + ": ");
		        printTree(root);
		        System.out.println();
		    }
	}
}
