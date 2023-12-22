package p1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class usernameandpswd {

	public static void main(String[] args) {
		String[][] usernamepswd=new String[4][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name and password:");
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++)
		
		{
			usernamepswd[i][j]=sc.next();
		}
		}
	for(int i=0;i<4;i++) {
		for(int j=0;j<2;j++)
		{
			System.out.print(usernamepswd[i][j]+" ");
		}
	System.out.println();
	}
}
}
	
