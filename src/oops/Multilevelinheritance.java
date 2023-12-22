package oops;
class Animal
{
	String size;
	public void animalmethod()
	{
		System.out.println("animal method");
	}
	
}
class Dog extends Animal
{
	public void dogfooddetails()
	{
		System.out.println("dog food");
	}
}
class Babydog extends Dog
{
	public void babydogmethd()
	{
		System.out.println("baby dog");
	}
}

public class Multilevelinheritance {
	public static void main(String[] args) {
		Babydog pb=new Babydog();
		System.out.println(pb.size="56");
		pb.animalmethod();
		pb.dogfooddetails();
		pb.babydogmethd();
			
	}

}
