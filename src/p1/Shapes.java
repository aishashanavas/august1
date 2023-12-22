package p1;

public class Shapes {

	public static void main(String[] args) {
		//shapes 
		//triangle=.5*b*h;
		//circle=3.14*r*r;
		//rectangle=l*b;
		//square=a*a
		Shapes ob=new Shapes();
		ob.mul(.5,5,8);
		double circlearea=ob.circle(3.14,4.5);
				System.out.println("area of circle="+circlearea);
		double rectarea=ob.rectangle();
		System.out.println("area of rectangle="+rectarea);
		ob.square();
		
		
		
		
		
		
	}
//1.triangle(without returntype and with parameter)
	public void mul( double t,int b,int h) 
	{
		double d=t*b*h;
		System.out.println("area of triangle="+d);
	}
	
	//2.circle(with returntype and with parameter)
	public double circle(double c,double r)
	{
		double cc=c*r*r;
		return cc;
		
	}
	//3.rectangle(with returntype and without parameter)
	public double rectangle()
	{
		double l=6.5;
		double b=1.5;
		double rr=l*b;
		return rr;
		
	}
	//4.square(without returntype and without parameter)
	public void square()
	{
		double s=5.8,w;
		w=s*s;
		System.out.println("area of square="+w);
		
	}
	
	
	
	
}
