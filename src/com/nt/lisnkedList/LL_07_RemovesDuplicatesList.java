package com.nt.lisnkedList;

public class LL_07_RemovesDuplicatesList {

	private static ListNode removeDuplicates(ListNode node1) {
		// Base Condition for List Node 
		
		if(node1==null || node1.next==null) return node1;
		ListNode head=node1;
		
		while(head.next!=null) {
			if(head.val==head.next.val) {
				head.next=head.next.next;
			} else {
				head=head.next;
			}
		}
		return node1;
	}
	
	private static ListNode removeDuplicatesSortedList(ListNode head) {
		  if (head == null || head.next == null) return head;

	        ListNode res = new ListNode(0,head);
	        ListNode prev = res;

	        while(head != null && head.next != null){
	            if(head.next.val == head.val){
	                while(head.next != null && head.next.val == head.val){
	                    head = head.next;
	                }
	                prev.next = head.next;
	            }else{
	                prev = prev.next;
	            }
	            head = head.next; 
	        }
	        return res.next;
	}
	
	public static void main(String[] args) {
		
		
		ListNode node1 = new ListNode(1);
		node1.next = new ListNode(1);
		node1.next.next = new ListNode(3);
		node1.next.next.next = new ListNode(4);
		
		
		ListNode node = removeDuplicatesSortedList(node1);

		while (node != null) {
			System.out.println(node.val + " ");
			node = node.next;
		}
	}

}
