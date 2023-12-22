package oops;


class Parent
{
	public void parentmethod()
	{
		System.out.println("parentmethod");
	}
}
class child extends Parent
{
	public void childmethod()
	{
		System.out.println("childmethod");
	}
}


public class Singlelevelinheritance {
	
	public static void main(String[] args) {
		
		child ob=new child();
		ob.parentmethod();
		ob.childmethod();
	}

}
