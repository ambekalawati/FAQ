package queueDataStructure;

public class MyQueuePractice {
	private int[] array;
	private int size;
	private static final int CAPACITY = 10;

	public MyQueuePractice() {
		this.array = new int[CAPACITY];
	}

	public void enQueue(int data) {
		if (!isFull()) {
			this.array[size++] = data;
		} else {
			System.out.println("Queue is Full");
		}
	}

	public int deQueue() {
		if (!isEmpty()) {
			int data = this.array[0];
			for (int i = 0; i < size - 1; i++) {
				array[i] = array[i + 1];
			}
			size--;
			return data;
		} else {
			return -1;
		}
	}

	public int getFront() {
		return !isEmpty() ? array[0] : -1;
	}

	public int getRear() {
		return !isEmpty() ? array[size - 1] : -1;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == CAPACITY;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyQueuePractice mq = new MyQueuePractice();
		mq.enQueue(10);
		mq.enQueue(20);
		mq.enQueue(30);
		mq.enQueue(40);
		mq.enQueue(50);
		System.out.println(mq.size());
//		mq.deQueue();
//		mq.deQueue();
//		mq.deQueue();
		System.out.println(mq.getFront());
		mq.display();
		System.out.println(mq.size());

	}
}
