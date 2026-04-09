package com.nt.lisnkedList;

public class LL_06_RotateLinkedList {
	
	private static ListNode roateTheList(ListNode head,int k) {
		
		 if (head == null || head.next==null || k==0) return head;

	        int length = 1;
	        ListNode dummy = head;

	        while (dummy.next!= null) {
	            dummy = dummy.next;
	            length++;
	        }

	        int position = k % length;
	        if (position == 0) return head;

	        ListNode current = head;
	        for (int i = 0; i < length - position - 1; i++) {
	            current = current.next;
	        }

	        ListNode newHead = current.next;
	        current.next = null;
	        dummy.next = head;

	        return newHead; 
	}

	public static void main(String[] args) {
		
		ListNode node1 = new ListNode(1);
		node1.next = new ListNode(2);
		node1.next.next = new ListNode(3);
		node1.next.next.next = new ListNode(4);
		
		int k=2;
		
		ListNode node = roateTheList(node1,k);

		while (node != null) {
			System.out.println(node.val + " ");
			node = node.next;
		}

	}


}
