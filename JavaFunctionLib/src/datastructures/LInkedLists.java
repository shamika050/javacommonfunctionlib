package datastructures;

import datastructures.BinarySearchTree.Node;

public class LInkedLists {
	
	static class Node{
		Node next;
		Integer value;
		public Node(Integer value) {
			this.next = null;
			this.value = value;
		}
	}
	
	static Node insert(Node head,Integer data) {
		Node newN = new Node(data);
		if(head == null) {
			head = newN;
			return head;
		}
		Node tempN = head;
		while(tempN != null) {
			if(tempN.next ==  null) {
				tempN.next = newN;
				break;
			}
			tempN = tempN.next;
		}
		return head;
	}
	
	public static Node removeDuplicates(Node head) {
	   Node temp = head;
	   if(head == null) {
		   return head;
	   }
	   while(temp != null) {
		   Node tempIn = temp;
		   Integer value = tempIn.value;
		   if(temp.next ==  null) {
				break;
		   }
		   while(tempIn != null) {
			   
			   if(tempIn.next ==  null) {
					break;
			   }
			   if(tempIn.next.value == value){
				   tempIn.next = tempIn.next;
			   }
			   tempIn = tempIn.next;
			   
		   }
		   temp = temp.next;
	   }
	   return head;
	}

}
