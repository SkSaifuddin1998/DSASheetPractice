package com.nt.lisnkedList;

public class LL_05_SwapTheLinkedListPairs {
	
	//Time Complexity T(C)=0(n)  and S(c)=0(1)
	
	/*1.Start from the head of the linked list.

	2.Traverse the list while the current node and the next node both exist.

	3.Swap the values of the current node and the next node.

	4.Move the pointer two steps forward to process the next pair.

	5.Continue until there are no more pairs left.
	
	*/
	private static ListNode swapTheNumbers(ListNode node1) {
		ListNode head=node1;
		
		while(head!=null && head.next!=null) {
			int temp=head.val;
			head.val=head.next.val;
			head.next.val=temp;
			
			head=head.next.next;
		}
		return node1;
	}

	
	public static void main(String[] args) {
		
		ListNode node1 = new ListNode(1);
		node1.next = new ListNode(2);
		node1.next.next = new ListNode(3);
		node1.next.next.next = new ListNode(4);
		
		ListNode node = swapTheNumbers(node1);

		while (node != null) {
			System.out.println(node.val + " ");
			node = node.next;
		}

	}
}
