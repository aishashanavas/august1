package oops;
class CARS
{
	public void Car()
	{
		System.out.println("kia");
	}
}
class Cars1 extends CARS
{

	@Override
	public void Car() {
		System.out.println("ford");
		System.out.println("engine speed=1498cc");
		
	}
	
}
class Cars2 extends CARS
{

	@Override
	public void Car() {
		System.out.println("swift");
		System.out.println("1.2L Dualjet Petrol Engine");
	}
	
}

public class Carsoverriding {

	public static void main(String[] args) {
		CARS c=new Cars1();
		c.Car();
		c=new Cars2();
		c.Car();
		
		

	}

}
