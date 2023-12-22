package p1;

import java.util.Scanner;

public class arrayprgm {

	public static void main(String[] args) {
		int[] ar=new int[3];
		  System.out.println("enter numbers");
		  Scanner sc=new Scanner(System.in);
		  for(int i=0;i<3;i++){
			  ar[i]=sc.nextInt();
		  }
			System.out.println("entered numbers");
		//	for(int i=0;i<3;i++)
				for(int v:ar)
		{
				System.out.println(v);
		//	System.out.println(ar[i]);
		}

	}

}
