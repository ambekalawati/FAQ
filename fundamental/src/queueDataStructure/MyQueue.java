package queueDataStructure;

public class MyQueue {
	private int[] array;
	private int size;
	private static final int CAPACITY = 10;

	public MyQueue() {
		this.array = new int[CAPACITY];
	}
	/*
	 *  T.C-O(1)
	 */
	public void enQueue(int data) {
		if (!isFull()) {
			this.array[size++] = data;
		}
	}
	/*
	 *  T.C-O(n)
	 *  Q-: Is it possible to reduce time complexity to O(1)?
	 *  Ans- Yes possible ( Hint-: using circular Array.)
	 *  rear=(front+(size-1)%capacity)
	 */

	public int deQueue() {
		if (!isEmpty()) {
			int data = this.array[0];
			for (int i = 0; i < size - 1; i++) {
				array[i] = array[i + 1];

			}
			size--;
			return data;

		} else
			return -1;
	}
	/*
	 *  T.C-O(1)
	 */

	public int getFirst() {
		return !isEmpty() ? array[0] : -1;
	}
	/*
	 *  T.C-O(1)
	 */

	public int getLast() {
		return !isEmpty() ? array[size - 1] : -1;
	}
	/*
	 *  T.C-O(1)
	 */

	public int size() {
		return size;
	}
	/*
	 *  T.C-O(1)
	 */

	public void clean() {
		this.array = null;
	}
	/*
	 *  T.C-O(1)
	 */

	public boolean isFull() {
		return size == CAPACITY;

	}
	/*
	 *  T.C-O(1)
	 */

	public boolean isEmpty() {
		return size == 0;
	}
	public static void main(String[] args) {
		MyQueue queue=new MyQueue();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		System.out.println(queue.getFirst());
		System.out.println(queue.size());
//		System.out.println(queue.deQueue());
//	    System.out.println(queue.deQueue());
//		System.out.println(queue.deQueue());
		System.out.println(queue.size());
	}
	

}
