package list;
import java.util.*;

public class ArrayListCreate {

	public static void main(String[] args) {
		ArrayList<Integer> firstFiveNumber= new ArrayList<>();
		firstFiveNumber.add(1);
		firstFiveNumber.add(2);
		firstFiveNumber.add(3);
		firstFiveNumber.add(4);
		firstFiveNumber.add(5);
		ArrayList<Integer> nextFiveNumber=new ArrayList<>();
		nextFiveNumber.add(6);
		nextFiveNumber.add(7);
		nextFiveNumber.add(8);
		nextFiveNumber.add(9);
		nextFiveNumber.add(10);
		firstFiveNumber.addAll(nextFiveNumber);
		System.out.println(firstFiveNumber);
		firstFiveNumber.add(11);
		System.out.println(firstFiveNumber);
		
	}

}
