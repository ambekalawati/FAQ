package starPattern;

public class Pattern6 {
	public static void combinedtraingle() {
		int rc = 5;
		int bs = 0;
		int sc = 5;
		for(int row=0;row<rc;row++) {
			for(int i=0;i<sc;i++) {
				System.out.print("*");
			}
			for(int j=0;j<bs;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<sc;k++) {
				System.out.print("*");
			}
			System.out.println();
			bs=bs+2;
			sc=sc-1;
		}

	}

	public static void main(String[] args) {
		combinedtraingle();

	}

	
}
