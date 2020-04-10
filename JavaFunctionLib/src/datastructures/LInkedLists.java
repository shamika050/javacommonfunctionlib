package datastructures;

import datastructures.BinarySearchTree.Node;

public class LInkedLists {
	
	static class Node{
		Node next;
		Integer data;
		public Node(Integer data) {
			this.next = null;
			this.data = data;
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
		   Integer value = tempIn.data;
		   if(temp.next ==  null) {
				break;
		   }
		   while(tempIn != null) {
			   
			   if(tempIn.next ==  null) {
					break;
			   }
			   if(tempIn.next.data == value){
				   tempIn.next = tempIn.next.next;
			   }else {
				   tempIn = tempIn.next;
			   }
			   
		   }
		   temp = temp.next;
	   }
	   return head;
	}

}
