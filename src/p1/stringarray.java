package p1;

import java.util.Scanner;

public class stringarray {

	public static void main(String[] args) {
		String name[]=new String[5] ;
		System.out.println("enter names:");
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<5;i++) {
			name[i]=sc.next();
		}
System.out.println("entered names:");
for(String v:name) {
	System.out.println(v);
}
	}

}
