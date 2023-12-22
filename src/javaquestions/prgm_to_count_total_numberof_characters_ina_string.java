package javaquestions;

import java.util.Scanner;

public class prgm_to_count_total_numberof_characters_ina_string {

	public static void main(String[] args) {
		System.out.println("enter the sentenance");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int c=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=' ') {
				c++;
			}
		}
		System.out.println(c);

	}

}
