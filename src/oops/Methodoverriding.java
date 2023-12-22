package oops;
class Parents
{
	public void phone()
	
	{
		System.out.println("samsung");
	}
}
 class Child1 extends Parents
{

	@Override
	public void phone() {
		System.out.println("iphone");
		super.phone();
	}
	
}
 
 
public class Methodoverriding {

	public static void main(String[] args) {
		Child1 ob=new Child1();
		ob.phone();
	
	}

}
