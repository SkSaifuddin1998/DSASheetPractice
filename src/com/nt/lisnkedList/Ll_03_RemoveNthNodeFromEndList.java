package com.nt.lisnkedList;

public class Ll_03_RemoveNthNodeFromEndList {
	
	private static ListNode removeNthNode(ListNode head,int n) {
		
		 ListNode start = new ListNode();
			start.next = head;
			ListNode fast = start;
			ListNode slow = start;
			for (int i = 0; i <= n; i++) {
				fast = fast.next;
			}

			while (fast != null) {
				fast = fast.next;
				slow = slow.next;
			}
			slow.next = slow.next.next;
			return start.next;
	}

	public static void main(String[] args) {
		
		ListNode node1 = new ListNode(1);
		node1.next = new ListNode(2);
		node1.next.next = new ListNode(3);
		node1.next.next.next = new ListNode(4);
		
		ListNode removeNthNode = removeNthNode(node1, 2);
		
		while (removeNthNode != null) {
			System.out.println(removeNthNode.val + " ");
			removeNthNode = removeNthNode.next;
		}

	}

}
