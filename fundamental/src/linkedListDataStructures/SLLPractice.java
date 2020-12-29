package linkedListDataStructures;

public class SLLPractice {
	private Node head;
	private int size;

	private static class Node {
		int data;
		Node next;
		

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	public void addFirst(int data) {
		Node newNode = new Node(data, null);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public void addLast(int data) {
		Node newNode = new Node(data, null);
		Node temp = head;
		while (temp != null && temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		size++;
	}

	public void addSpecific(int index, int data) {
		Node newNode = new Node(data, null);
		if (index >= 0 && index <= size) {
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			size++;
		} else {
			System.out.println("Index Out Of Range");
		}

	}

	public void add(int index, int data) {
		Node newNode = new Node(data, null);
		if (!(index >= 0 && index <= size)) {
			System.out.println("Index Out Of Bound");
			return;
		}
		if (index == 0) {
			addFirst(data);
			return;
		}
		if (index == size) {
			addLast(data);
			return;
		}
		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		size++;
	}

	public void add(int data) {
		Node newNode = new Node(data, null);
		if (head == null) {
			newNode.next = head;
			head = newNode;
			size++;
		} else {
			Node temp = head;
			while (temp != null && temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			size++;

		}
	}

	public void removeFirst() {
		if (head == null) {
			return;
		} else {
			head = head.next;
			size--;
		}

	}

	public void removeLast() {
		if (head == null) {
			return;
		} else {
			Node temp = head;
			for (int i = 0; i < size - 2; i++) {
				temp = temp.next;
			}
			temp.next = null;
			size--;

		}
	}

	public int get(int index) {
		if (!(index >= 0 && index < size)) {
			System.out.println("Invalid Index");
		}
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public int size() {
		return size;
	}

	public boolean contains(int data) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == data) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
}
