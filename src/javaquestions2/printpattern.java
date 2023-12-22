package javaquestions2;

public class printpattern {

	public static void main(String[] args) {
	//	1
	//	23
	//	456
	//	7 8 9 10
	//	11 12 13 14 15
		int n=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(n);
				
				
			n++;
			}
				
			
			System.out.println();
		}
 	}

}
/*Initialize n to 1, which represents the starting number.
Use two nested for loops. The outer loop iterates from 1 to 5, representing the number of rows.
The inner loop iterates from 1 to the current row number (i), which controls how many numbers are printed in that row.
Inside the inner loop, print the current value of n followed by a space.
Increment n after each number is printed.
After printing each row, move to the next line by using System.out.println().*/