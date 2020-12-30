package starPattern;

public class Pattern1 {
	public static void printRightAngelTraingle() {
	int rc = 5;
	int bs = 4;
	int sc = 1;
	for(int row = 0; row<rc;row++) {
		for(int i = 0; i<bs;i++) {
			System.out.print(" ");
		}
		for(int j=0; j<sc; j++) {
			System.out.print("*");
		}
		System.out.println();
		bs=bs-1;
		sc=sc+1;
	}
	}
	

	public static void main(String[] args) {
		printRightAngelTraingle();
		
		

	}

}
