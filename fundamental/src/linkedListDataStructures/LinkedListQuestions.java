package linkedListDataStructures;
/* (Assume Singly Linked List)
 * Q1. Find middle of linked list?
 * Q2. Find nth node from end of linked list?
 * Q3. Reverse a link list?
 * Q4. Detect a loop in a link list?
 * Q5. Detect and remove loop in a linked list?
 */
public class LinkedListQuestions {
	private Node head;
	private int size;

	public static class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	public void add(int data) {
		Node newNode = new Node(data, null);
		if (head == null) {
			addFirst(data);
		} else {
			addLast(data);

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
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void middle() {
		Node temp1=head;
		Node temp2=head;
		
			if(head!=null) {
				while(temp1!=null && temp1.next!=null) {
					temp1=temp1.next.next;
					temp2=temp2.next;
				}
				System.out.println(temp1);
			}
		}

	public static void main(String[] args) {
		LinkedListQuestions llq = new LinkedListQuestions();
		llq.add(10);
		llq.add(20);
		llq.add(30);
		llq.add(40);
		llq.add(50);
		llq.display();
		llq.middle();
	}
}
