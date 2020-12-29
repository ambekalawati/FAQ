package arrayDataStructures;

public class DynamicArrayPractice {
	private int[] array;
	private int size;
	private int capacity = 10;

	public DynamicArrayPractice() {
		this.array = new int[capacity];
	}

	public void add(int data) {
		if (size != capacity) {
			this.array[size++] = data;
		} else {
			int[] temp = this.array;
			this.capacity = capacity * 2;
			this.array = new int[capacity];
			for (int i = 0; i < size; i++) {
				this.array[i] = temp[i];
			}
			array[size++] = data;
		}

	}
	/*
	 * 1. first check index is in the range. 
	 * 2. start the loop from index till size.
	 * 3. assign value of array[i+1] into array[i].
	 * 4. and then increase the size.
	 * 
	 * T.C:- O(n)
	 * S.C:- O(1)
	 */

	public void remove(int index) {
		if (index >= 0 && index < size) {
			for (int i = index; i < size; i++) {
				this.array[index] = array[++index];
			}
			size--;
		}
	}
	/*
	 * 1. check index is in the range
	 * 2. return the value (array[index])
	 * T.C:- O(1)
	 * S.C:- O(1)
	 */

	public int get(int index) {
		if (index >= 0 && index < size) {
			return array[index];
		} else
			return -1;
	}
	/*
	 * 1. iterate the loop from o to size.
	 * 2. check array[i]==data then return true. 
	 * 3. else return false.
	 * T.C:- O(n)
	 * S.C:- O(n)
	 */
	public boolean contains(int data) {
		for(int i=0;i<size;i++) {
			if(array[i]==data) {
				return true;
			}
			
		}
			return false;
	}
	/*
	 * 1. iterate loop from 0 to size
	 * 2. print array[i]
	 * 
	 * T.C:- O(n)
	 * S.C:- O(1)
	 */

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}
	/*
	 * T.C:- O(1)
	 * S.C:- O(1)
	 */

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		DynamicArrayPractice da = new DynamicArrayPractice();
		da.add(10);
		da.add(20);
		da.add(30);
		da.add(40);
//		da.remove(2);
		System.out.println(da.get(3));
		da.display();
		System.out.println(da.size());
	}
}
