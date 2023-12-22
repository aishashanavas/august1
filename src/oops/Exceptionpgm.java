package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgm {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream ob=new FileInputStream("C:\\Users\\ADMIN\\Downloads\\st.JPG");
		try {
		
		int a=10,b=0;
		double c=a/b;
		System.out.println(c);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("arithmetic exception");
		}
			System.out.println("hello");
		
	
	try
	{
	String s=null;
System.out.println(s.length());
	}
	catch (Exception e)
	{
		System.out.println("null pointer exception");
	}
	System.out.println("hello2");
 
	}

}
