package arrayDataStructures;

public class FixedArray {
	private int[] array;
	private int size;
	private static final int CAPACITY=10;

	public FixedArray() {
		this.array = new int[CAPACITY];
	}
	/*
	 * 1. first check array is full or not.
	 * 2. if full print array is full.
	 * 3. if not then insert data and increase size.
	 */
	public void add(int data) {
		if (size != CAPACITY) {
			array[size] = data;
			size++;
		}
		else {
			System.out.println("Array is Full..");
		}
	}
	/*
	 * 1. first validate the given index is in the range or not.
	 * 2. if in the range then start the loop from size-1 to given index position.
	 * 3. do the right shifting and insert the element and increase the size.
	 */
	public void addSpecific(int index, int data) {
		if (index >= 0 && index < size) {
			for (int i = size - 1; i >= index; i--) {
				array[i + 1] = array[i];
			}
			array[index] = data;
			size++;
		}
	}
/*
 * 1. validate the index is lies in range or not
 * 2. if yes then traverse till the index position.
 * 3. remove specific and decrease the size.
 */
	public void remove(int index) {
		if (index >= 0 && index < size) {
			for (int i = index; i < size - 1; i++) {
				array[index] = array[++index];
			}
			size--;
//                    Or
		}
	}
	public void removeSpecific(int index) {
		if(index>=0 && index<size) {
			for(int i=index;i<size;i++) {
				array[index]=array[++index];
			}
			size--;
		}
	}
	public int get(int index) {
		if(index>=0 && index<size) {
			return array[index];
		}else {
			return -1;
		}
	}
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.println(array[i]);
		}
	}
	public boolean contains(int data) {
		for(int i=0;i<size;i++) {
			if(array[i]==data) {
				return true;
			}
		}
		return false;
	}
	public int size() {
		return size;
	}
	public static void main(String[] args) {
		FixedArray list=new FixedArray();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
// 		System.out.println(list.size());
    	list.removeSpecific(1);
//		list.addSpecific(0, 50);
//		list.remove(1);
    	System.out.println(list.get(0));
//		System.out.println(list.contains(40));
		list.display();
	}

}
