package oops;
interface BasicAnimal
{
	public void eat();
	public void sleep();
	
}
class Monkey 
{
public void jump()
{
	
	System.out.println(" monkey jump");
}
public void bite()
{
	System.out.println("monkey bite");
}
}
class Human extends Monkey implements BasicAnimal

{

	@Override
	public void eat() {
		System.out.println("human eat");
		
	}

	@Override
	public void sleep() {
		System.out.println("human sleep");
		
	}
	
}



public class Animalinterfacepgm {

	public static void main(String[] args) {
		Human m=new Human();
		m.bite();
		m.jump();
		m.eat();
		m.sleep();
		
		
	}

}
