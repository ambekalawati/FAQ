package list;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
	/*	ArrayList a= new ArrayList();
      a.add(10);
      a.add("kalawati");*/
      ArrayList<Integer> al= new ArrayList<>();
      al.add(10);
      al.add(20);
      al.add(30);
      al.add(40);
      al.add(50);
      al.add(60);
      al.add(70);
      al.add(80);
      al.add(90);
      al.add(100);
      int b= al.size();
     // System.out.println(b);
      // iterate(fetch) ArrayList
      // 1
    /*  for(int x= 0; x< al.size();x++) {
    	int result =al.get(x) ;
    	System.out.println(result);
      }*/
     // 2 
   /*  int i=0;
     while(i< al.size()) {
    	 System.out.println(al.get(i++));
    	 
     }*/
      // 3
    /*  Iterator<Integer> iterator =al.iterator();
      while(iterator.hasNext()) {
    	  System.out.println(iterator.next());
      }*/
      // 4
   /*   ListIterator<Integer> listIterator=al.listIterator();
      while(listIterator.hasNext()) {
    	  System.out.println(listIterator.next());
      }*/
      // 5
    /*  Enumeration<Integer> enumeration = Collections.enumeration(al);
      while(enumeration.hasMoreElements()) {
    	  System.out.println(enumeration.nextElement());
      }*/
      //6 enhance for loop 1.5 onwards
    /*  for(int i:al) {
    	  System.out.println(i); 
      }*/
      //7
      al.forEach(System.out::println);//from java 1.8 onwards
      
      
      
	} 

}
