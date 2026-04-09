package com.nt.lisnkedList;

public class LL_02_AddTwoNumbers {

	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode dummy = new ListNode();
	        ListNode cur=dummy;
	        int carry=0;
	        while(l1!=null || l2!=null || carry!=0){
	            int sum=carry;
	            if(l1!=null){
	                sum +=l1.val;
	                l1=l1.next;
	            }
	            if (l2 != null) {
	                sum += l2.val;
	                l2 = l2.next;
	            }
	            carry = sum / 10;
	            cur.next = new ListNode(sum % 10);
	            cur = cur.next;
	        }
	        return dummy.next;
	    }

	public static void main(String[] args) {

		ListNode node1 = new ListNode(2);
		node1.next = new ListNode(4);
		node1.next.next = new ListNode(3);

		ListNode node2 = new ListNode(5);
		node2.next = new ListNode(6);
		node2.next.next = new ListNode(7);

		ListNode node = addTwoNumbers(node1, node2);

		while (node != null) {
			System.out.println(node.val + " ");
			node = node.next;
		}

	}

}
