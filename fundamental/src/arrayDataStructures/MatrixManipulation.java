package arrayDataStructures;

public class MatrixManipulation {
	
	/*
	 * Q1. write a program of matrix addition.
	 * Q2. Write a program of matrix multiplication.
	 * Q3. Write a program of matrix subtraction.
	 *Given  int[][]= {
	 * 			{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}								
	 * 			}
	 * Q4. print the elements in snake pattern ----> 4,3,2,1..5,6,7,8...12,11,10,9....13,14,15,16
	 * Q5. print all the elements 1->16.
	 * Q6. print elements using boundary traversal.---->1,2,3,4,8,12,16,15,14,11,3,9,5
	 * Q7. print all the elements in spiral form.------>1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
	 * 
	 */
	public static void main(String[] args) {
//	Q1. write a program of matrix addition.
		int[][] a= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] b= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] c=new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]);
			}
		}
		System.out.println("*************************************");
// Q2. Write a program of matrix multiplication.
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				c[i][j]=0;
				for(int k=0;k<4;k++) {
					c[i][j]+=a[i][j]*b[k][j];
				}
				System.out.println(c[i][j]);
			}
			System.out.println();
		}
//	Q3. Write a program of matrix subtraction.
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				c[i][j]=a[i][j]-b[i][j];
				System.out.println(c[i][j]);
			}
		}
// Q4. print the elements in snake pattern ----> 4,3,2,1..5,6,7,8...12,11,10,9....13,14,15,16
	
//Q5. print all the elements 1->16.
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.println(a[i][j]);
			}
		}

//Q4. print the elements in snake pattern ----> 4,3,2,1..5,6,7,8...12,11,10,9....13,14,15,16
for(int i=0;i<a[0].length;i++) {
	if(i%2==0) {
		for(int j=a[0].length-1;j>=0;j--) {
			System.out.println(a[i][j]);
		}
	}else {
		for(int j=0;j<a[0].length;j++) {
			System.out.println(a[i][j]);
		}
	}
	System.out.println();
}
// Q6. print elements using boundary traversal.---->1,2,3,4,8,12,16,15,14,11,3,9,5
	/*	int row=4;
		int col=4;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0) {
					System.out.println(a[i][j]);
				}else if(i==row-1) {
					System.out.println(a[i][j]);
				}else if(j==0) {
					System.out.println(a[i][j]);
				}else if(j==col-1) {
					System.out.println(a[i][j]);
				}
		}
	}*/

	}
	}
