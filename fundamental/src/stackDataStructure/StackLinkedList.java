package stackDataStructure;

public class StackLinkedList {
	private Node top;
	private int size;

	public void push(int data) {
		Node newNode = new Node(data, null);
		newNode.next = top;
		top = newNode;
		size++;
	}

	public int pop() {
		if (top == null) {
			throw new RuntimeException("Stack Underflow");
		} else {
			int data = top.data;
			top = top.next;
			size--;
			return data;
		}
	}

	public int peek() {
		if (top == null) {
			throw new RuntimeException("Stack Underflow");
		} else {
			int data = top.data;
			top = top.next;
			return data;
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}
	public void clean() {
		this.top=null;
	}

	private static class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

	}
	public static void main(String[] args) {
		StackLinkedList stack=new StackLinkedList();
		System.out.println(stack.isEmpty());
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		stack.clean();
		System.out.println(stack.pop());
	}

}
