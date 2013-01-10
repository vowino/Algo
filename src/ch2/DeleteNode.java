package ch2;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

/* 2.3
 * delete a node in the middle of a single linked list, given only access to that node
 */
public class DeleteNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListNode head = AssortedMethods.randomLinkedList(5, 0, 10);
		System.out.println(head.printForward());
//		deleteNodeMiddle(head.next.next.next.next); // delete node 4
//		deleteEnd(head);
		System.out.println(deleteEnd(head).printForward());

	}
	public static boolean deleteNodeMiddle(LinkedListNode node){
		if(node == null || node.next == null) {return false;}
		node.data = node.next.data;
		node.next = node.next.next;
		return true;
	}
	public static LinkedListNode deleteFront(LinkedListNode head){
		if(head == null || head.next == null){
			return null;
		}
		LinkedListNode next = head.next;
		head.data = next.data;
		head.next = next.next;
		next = null;
		return head;
	}
	
	public static LinkedListNode deleteEnd(LinkedListNode head){
		if(head == null) return head;
		if(head.next == null){ head = null; return head;}
		if(head.next.next == null){ head.next = null; return head;}
		LinkedListNode cur = head;
		while(cur.next.next != null){
			cur = cur.next;
		}
		cur.next = null;
		return head;
	}
}