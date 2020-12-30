package GarbageCollector;

public class RunTimeExample {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		long free = r.freeMemory();
		free = free / 1024;
		free = free / 1024;
		System.out.println(free);
		long total = r.totalMemory();
		System.out.println("total :"+ (total/1024)/1024);
		int processorCount =r.availableProcessors();
		System.out.println(processorCount);
		r.gc();
		System.gc();
	}

}
