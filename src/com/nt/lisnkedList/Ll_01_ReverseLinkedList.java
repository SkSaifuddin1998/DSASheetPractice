package com.nt.lisnkedList;

import java.util.Stack;

public class Ll_01_ReverseLinkedList {

	// 1.store the value stack
	// 2. Reset the Value LinkList
	// 3.Assign the value linked list

	public static ListNode reverseLinkedList(ListNode head) {

		Stack<Integer> stack = new Stack<Integer>();

		ListNode temp = head;
		while (temp != null) {
			stack.push(temp.val);
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			temp.val = stack.pop();
			temp = temp.next;
		}

		return head;
	}
	
	public static ListNode reverseList(ListNode head) {
        // Initialize previous pointer to null
        ListNode prev = null;

        // Start from the head of the list
        ListNode temp = head;

        // Traverse the list
        while (temp != null) {
            // Save the next node
            ListNode front = temp.next;

            // Reverse the current node's pointer
            temp.next = prev;

            // Move prev to current node
            prev = temp;

            // Move to the next node
            temp = front;
        }

        // Return new head (last node becomes first)
        return prev;
    }

	public static void main(String[] args) {

		ListNode node = new ListNode(0);
		node.next = new ListNode(1);
		node.next.next = new ListNode(2);

		node = reverseLinkedList(node);
		while (node != null) {
			System.out.println(node.val + " ");
			node = node.next;
		}
		
		ListNode reverseList = reverseList(node);
		
		while (reverseList != null) {
			System.out.println(reverseList.val + " ");
			reverseList = reverseList.next;
		}
	}

}
