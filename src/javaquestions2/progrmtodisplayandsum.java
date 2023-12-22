package javaquestions2;

import java.util.Scanner;

public class progrmtodisplayandsum {

	public static void main(String[] args) {
	//	.Write Java program to display terms of natural mumbers and their sum

Scanner sc=new Scanner(System.in);
System.out.println("enter the number of natural nos:");
int n=sc.nextInt();
int sum=0;
if (n<=0) {
System.out.println("please enter numbers greater than 0");
}
else {
	sum=0;
	System.out.println("number of natural numbers=");
}
for(int i=1;i<=n;i++)
{
	System.out.println(i+" ");
	sum +=i;
}
System.out.println("the sum of " + n + "natural numbers:" +sum);

		
	/*	        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter the number of natural numbers: ");
		        int n = scanner.nextInt();
		        
		        int sum = 0;
		        
		        System.out.print("Natural numbers from 1 to " + n + ": ");
		        for (int i = 1; i <= n; i++) {
		            System.out.print(i + " ");
		            sum += i;
		        }
		        
		        System.out.println("\nSum of natural numbers from 1 to " + n + " is: " + sum);
		    
		*/

	}
	
}
