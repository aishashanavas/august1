package javaquestions;

import java.util.Scanner;

public class palindrome_or_not_malayalam {

	public static void main(String[] args) {
		String a,b="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		a=sc.nextLine();
		int n=a.length();
		for(int i=n-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
if(a.equalsIgnoreCase(b))
{
	System.out.println(a+ " is a palindrome");
}
else
{
	System.out.println(a+ " is not a palindrome"); 
}                                                           
	
			
	}

}
