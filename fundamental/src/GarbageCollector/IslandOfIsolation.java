package GarbageCollector;

public class IslandOfIsolation {
	IslandOfIsolation i= null;

	public static void main(String[] args) {
		IslandOfIsolation t1 = new IslandOfIsolation();
		IslandOfIsolation t2 = new IslandOfIsolation();
		IslandOfIsolation t3 = new IslandOfIsolation();
		
		t1.i=t2;
		
		t2.i=t3;
		
		t3.i=t1;
		
		t1 = null;// 0 object for GC
		t2= null;// 0 object for GC
		t3 = null; // 3 object for GC
		

	}

}
