package com.practice.problems;

class LL {
	Node head;
	private int size;

	LL() {
		size = 0;
	}

	public class Node {

		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
			size++;

		}
	}

	public void addFirst(String data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void addInMiddle(int index, String data) {
		if (index > size || index < 0 ) {
			System.out.println("Incalid Index Value ");
			return;
		}
		size++;
		Node newNode = new Node(data);
		
		if (head == null || index == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node currNode = head;
		for (int i = 1; i < size; i++) {
			if (i == index) {
				Node nextNode = currNode.next;
				currNode.next = newNode;
				newNode.next = nextNode;
				break;
			}
			currNode = currNode.next;
		}
		
		
	}

	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node lastNode = head;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
		}
		lastNode.next = newNode;
	}

	public void printLast() {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}

	public void removeFirst() {
		if (head == null) {
			System.out.println("Emoty list, nothing to delete ");
			return;
		}
		head = this.head.next;
		size--;
	}

	public void removeLast() {
		if (head == null) {
			System.out.println("Empty list nothisg to delete ");
			return;
		}
		size--;
		if (head.next == null) {
			head = null;
			return;
		}
		Node currNode = head;
		Node lastNode = head.next;

		while (lastNode.next != null) {
			currNode = currNode.next;
			lastNode = lastNode.next;
		}
		currNode.next = null;
	}

	public int getSize() {
		return size;
	}
}

public class Scratch_Implementation {

	public static void main(String[] args) {
		LL list = new LL();
		list.addLast("is");
		list.addLast("a");
		list.addLast("list");
		list.printLast();

		list.addFirst("this");
		list.printLast();
		System.out.println(list.getSize());
		list.removeFirst();
		list.printLast();
		list.removeLast();
		list.printLast();

	}

}
