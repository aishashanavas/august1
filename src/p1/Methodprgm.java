package p1;

import oops.Accessmodifiers;

public class Methodprgm {

	public static void main(String[] args) {
		

	
	Methodprgm ob=new Methodprgm();
			ob.add();
			int subans=ob.sub();
			System.out.println("sub="+subans);
			int mulans=ob.mul(40,30);
			System.out.println("mul="+mulans);
			ob.div(10, 5);
			
			
			
			
}

//1.method without returntype and without parameter
public void add()
{
	int a=20,b=30,c;
	c=a+b;
	System.out.println("sum="+c);
}
  
//2.method with returntype and without parameter
public int sub()
{
	int a=20,b=30,c;
	c=a-b;
	return c;
}

//3.method with returntype and with parameter
public int  mul(int a,int b)
{
	int c=a*b;
	return c;
	
	
}
//4.method withot returntype and with parameter
public void div(int a,int b)

{
	double d=a/b;
	System.out.println("queotient="+ d);
	//Accessmodifiers ob=new Accessmodifiers();
	//ob.n();
	
	
}
}
