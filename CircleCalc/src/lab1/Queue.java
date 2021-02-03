package lab1;

public class Queue {
	private static class Node {
		private int data;
		private Node next;
		private Node(int data) {
			this.data = data;
		}
	}
	
	private Node head;
	private Node tail;
	
	public boolean isEmpty( ) {
		return head == null;
	}
	public void add(int data) {
		Node node = new Node(data);
		if(tail != null) {
			tail.next = node;
		}
		tail = node;
		if(head == null) {
			head = node;
		}
	}
	public int getHeadData() {
		return head.data;
	}
	
}

