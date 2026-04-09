package com.nt.lisnkedList;

public class LL_04_MargerTwoSortedList {
	
	public static ListNode mergeTwoSortedNode(ListNode l1,ListNode l2) {
		
		 if(l1==null) return l2;
	        if(l2==null) return l1;
	        // Compare values and build the merged list recursively
	        if(l1.val < l2.val){
	            l1.next = mergeTwoSortedNode(l1.next, l2);
	            return l1;
	        }
	        else {
	            l2.next = mergeTwoSortedNode(l1, l2.next);
	            return l2;
	        }
		
	}

	public static void main(String[] args) {
		
		
		ListNode node1 = new ListNode(2);
		node1.next = new ListNode(4);
		node1.next.next = new ListNode(3);

		ListNode node2 = new ListNode(5);
		node2.next = new ListNode(6);
		node2.next.next = new ListNode(7);

		ListNode node = mergeTwoSortedNode(node1, node2);

		while (node != null) {
			System.out.println(node.val + " ");
			node = node.next;
		}

	}

}
