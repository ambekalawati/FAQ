package starPattern;

public class Pattern7 {
	public static void pyramid() {
		int rc=4;
		int bs=3;
		int sc=1;
		for(int row=0;row<rc;row++) {
			for(int i=0;i<bs;i++) {
				System.out.print(" ");
			}
			for(int j=0;j<sc;j++) {
				System.out.print("*");
			}
			System.out.println();
			bs=bs-1;
			sc=sc+2;
		}
			
		
	}

	public static void main(String[] args) {
		pyramid();
		

	}

}
