package p1;

import java.util.Scanner;

public class integerarray_sumandaverage {

	public static void main(String[] args) {
		int [] a=new int[5];
		int sum=0;
		System.out.println("enter numbers:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
             sum = sum+a[i];
		}

		System.out.println("sum="+sum);
System.out.println("average="+sum/5);
	}
}
