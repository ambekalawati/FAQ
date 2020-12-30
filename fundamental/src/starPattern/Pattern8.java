package starPattern;

public class Pattern8 {
	public static void xTree() {
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
		int rc1=3;
		int bs1=2;
		int sc1=3;
		for(int row=0;row<rc1;row++) {
			for(int i=0;i<bs1;i++) {
				System.out.print(" ");
			}
			for(int j=0;j<sc1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		xTree();
		

	}

}
