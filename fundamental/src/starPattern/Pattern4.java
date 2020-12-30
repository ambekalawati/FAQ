package starPattern;

public class Pattern4 {
	public static void reverseRightAngleTraingle() {
		int rc = 5;
		int bs = 0;
		int sc = 5;
		for(int row = 0;row<rc;row++) {
			for(int i=0;i<sc;i++) {
				System.out.print("*");
			}
			for(int j=0;j<bs;j++) {
				System.out.print(" ");
			}
			System.out.println();
			bs=bs+1;
			sc=sc-1;
		}
	}

	public static void main(String[] args) {
		reverseRightAngleTraingle();
		

	}

}
