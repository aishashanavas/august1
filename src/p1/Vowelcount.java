package p1;

public class Vowelcount {

	public static void main(String[] args) {
		Vowelcount ob=new Vowelcount();
		int vowel=ob.Countvowels();
		System.out.println("countofvowels="+vowel);

	}


//vowel count with returntype and without parameter
public int Countvowels()
{
	int count=0;
	String s="string";
	for (int i=0;i<s.length();i++)
	{
		 char c=s.charAt(i);
		if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
				c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
	count++;
		}
	}
		return count;
	}
}
/* The main method:

This is the entry point of the program.
It creates an instance of the VowelCount class named ob.
It calls the Countvowels method on the ob object to count the vowels and stores the result in the vowel variable.
Finally, it prints the count of vowels using System.out.println.
The Countvowels method:

This method is defined to count vowels in a given string.
It returns an int value, indicating the count of vowels.
It initializes a variable count to zero to keep track of the number of vowels.
It defines a string s containing the word "string" that you want to count vowels in.
The for loop:

The for loop iterates over each character in the string s.
It uses the loop variable i to access each character one by one.
Inside the loop:

It retrieves the character at the current position in the string and stores it in the variable c.
It checks if the character c is a lowercase vowel ('a', 'e', 'i', 'o', 'u') or an uppercase vowel ('A', 'E', 'I', 'O', 'U').
If the character is a vowel, it increments the count by 1.
The return statement:

The method returns the final value of count, which is the count of vowels in the string "string."
The corrected code counts the vowels correctly and returns the total count of vowels in the given string. In this case, since the string is "string," which has one lowercase 'i' as a vowel, the program will output "countofvowels=1."

*/