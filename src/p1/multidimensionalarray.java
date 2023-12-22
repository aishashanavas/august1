package p1;

import java.util.Scanner;

public class multidimensionalarray {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("enter rows and columns:");
int rows=sc.nextInt();
int cols=sc.nextInt();
int[][] a=new int[rows][cols];
		System.out.println("enter numbers:");
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
			System.out.print(a[i][j]+" ");
	}
		System.out.println();
		
	}
}
}