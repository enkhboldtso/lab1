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
	private int size;
	
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
		size++;
	}
	public int getHeadData() {
		return head.data;
	}
	public int getTailData() {
		return tail.data;
	}
	public int remove() {
		int data = head.data;
		head = head.next;
		if(head==null) {
			tail = null;
		}
		size--;
		return data;
	}
	public int size() {
		return size;
	}
	
}

