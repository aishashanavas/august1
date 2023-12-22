package p1;

import java.util.Scanner;

public class calculatorscanner {

	public static void main(String[] args) {
		System.out.println("enter two numbers");
		System.out.println("select an operation");
		System.out.println("a"+"s"+"m"+"d");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		char ch=sc.next().charAt(0);
		switch(ch) {
		case 'k':
		System.out.println("sum of two numbers ="+(a+b));
		break;
		case's':
		System.out.println("difference of two numbers="+(a-b));
		break;
		case 'm':
		System.out.println("product of two numbers="+(a*b));
		break;
		case 'd':
		System.out.println("result of division="+(a/b));
		break;
		default:
			System.out.println("invalid choice");
		
		}
		
		
	}

}
