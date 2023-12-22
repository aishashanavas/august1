package javaquestions;

import java.util.Scanner;

public class count_of_positive_negative_zero_inanarray {

	public static void main(String[] args) {
		int p=0;
		int n=0;
		int zero=0;
		
		
		Scanner sc=new Scanner(System.in);
	System.out.println("enter array size:");
	int	size=sc.nextInt();
	int[] a=new int[size];
	System.out.println("enter array elements:");
		for( int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(a[i]<0) 
				 n++;
		
			else if(a[i]>0)
			
				 p++;
				else
					zero++;
		}
		System.out.println("count of positive no.="+p);
		System.out.println("count of negativee no.="+n);
		System.out.println("count of zero no.="+zero);
	}

}
// how to declare size of an array in scanner class