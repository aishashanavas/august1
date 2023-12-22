package javaquestions;

import java.util.Scanner;

public class given_string_ends_with_string_language {

	public static void main(String[] args) {
		//java prgm to check given string ends with string "language"
		System.out.println("enter the sentenance:");
		Scanner sc=new Scanner(System.in);
		String ch=sc.nextLine();
		{
	
			System.out.println(ch.endsWith("language"));
	}
	}
}

