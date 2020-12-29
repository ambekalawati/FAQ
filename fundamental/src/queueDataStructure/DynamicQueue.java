package queueDataStructure;

public class DynamicQueue {
	private int[] array;
	private int size;
	private int capacity = 10;

	public DynamicQueue() {
		this.array = new int[capacity];
	}

	public void enQueue(int data) {
		if (!isFull()) {
			this.array[size++] = data;
		} else {
			int[] temp = array;
			this.capacity = capacity * 2;
			this.array = new int[capacity];
			for (int i = 0; i < size; i++) {
				temp[i] = array[i];
			}
			this.array[size++] = data;
		}
	}

	public int deQueue() {
		if (!isEmpty()) {
			int data = this.array[0];
			for (int i = 0; i < size; i++) {
				array[i] = array[i + 1];
			}
			size--;
			return data;
		} else {
			return -1;
		}
	}

	public int getFirst() {
		return !isEmpty() ? array[0] : -1;
	}

	public int getLast() {
		return !isEmpty() ? array[size - 1] : -1;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public int size() {
		return size;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		DynamicQueue queue = new DynamicQueue();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.display();
		System.out.println(queue.deQueue());
		System.out.println(queue.size());
		System.out.println(queue.getFirst());
		System.out.println(queue.getLast());

	}

}
