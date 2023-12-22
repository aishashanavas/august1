package oops;

public class Methodoverloading {

	public static void main(String[] args) {
	Methodoverloading ob=new Methodoverloading();
	ob.add(20, 30);
	ob.add(200, 170,4);
	ob.add(3, 1.5);
	ob.add(9.87, 40);
	}

	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
			
	}
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
}

