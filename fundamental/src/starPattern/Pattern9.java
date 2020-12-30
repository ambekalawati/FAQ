package starPattern;

public class Pattern9 {
	public static void diamond() {
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
		int rc1=4;
		int bs1=1;
		int sc1=5;
		for(int row=0;row<rc1;row++) {
			for(int i=0;i<bs1;i++) {
				System.out.print(" ");
			}
			for(int j=0;j<sc1;j++) {
				System.out.print("*");
			}
			System.out.println();
			bs1=bs1+1;
			sc1=sc1-2;
		}
		
	}

	public static void main(String[] args) {
		diamond();
		

	}

}
