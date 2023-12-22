package javaquestions2;

 import java.util.Scanner;

public class largestelementin {
	public static void main(String[] args) {
		//find largest element in an array
		Scanner sc=new Scanner (System.in);
	System.out.println("enter the size of array=");
	int size=sc.nextInt();
	if(size<0)
	{
		System.out.println("enter valid input");
		return;
	}
		int[] ar=new int[size];
		System.out.println("enter the elements of the array:");
		for(int i=0;i<size;i++) {
		ar[i]=sc.nextInt();
		}
		int largest=ar[0]; //initialize the largest variable to the first element of the array.
		for(int i=1;i<size;i++) { // iterate through the array, comparing each element with the current largest element and updating the largest variable when we find a larger element.
			if(ar[i]>largest) {
				largest=ar[i];
			}
		}
	System.out.println("lagest element in the array is:" +largest);	

/*	
	int[] ar= {1,2,3,5,8,9,45};
	int largest=ar[0];
	for(int i=1;i<ar.length;i++)
	{
		if(ar[i]>largest) {
			largest=ar[i];
			
		}
	}
	System.out.println("largest element in array="+largest);
	*/
	    }
	}
	
