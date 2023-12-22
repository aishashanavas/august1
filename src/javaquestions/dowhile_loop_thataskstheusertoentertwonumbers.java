package javaquestions;

import java.util.Scanner;

public class dowhile_loop_thataskstheusertoentertwonumbers {

	public static void main(String[] args) {
/* write a do-while loop that asks the user to enter two numbers. The nurbers should be added and the sun displayed.
The loop should ask the user whether he or she wishes to perform the operation again.
If so, the loop should repeat; otherwise it should terminate		*/
		char i;

		do {
			System.out.println("enter two numbers:");
			Scanner sc=new Scanner(System.in);
			int sum=0;
			int a=sc.nextInt();
            int b=sc.nextInt();
			sum=a+b;
			System.out.println(+sum);
			System.out.println("do you wish to perform the operation again?y/n");
		i=sc.next().charAt(0);
		}
		while(i=='y');

	}

}
