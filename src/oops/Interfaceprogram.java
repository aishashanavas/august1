
package oops;
interface Mycars
{
	public void enginespeed();
	public void acceleration();
	
}
interface Advanceoptions
{
	public void musicsystem();
}


class verna implements Mycars,Advanceoptions
{

	@Override
	public void enginespeed() {
		System.out.println("verna enginespeed");
	}

	@Override
	public void acceleration() {
		System.out.println("verna acceleration");
		
	}
	@Override
	public void musicsystem() {
		System.out.println("verna music system");
	}
}
	
	
	class ritz implements Mycars
	{

		@Override
		public void enginespeed() {
			System.out.println("ritz enginespeed");
		}

		@Override
		public void acceleration() {
			System.out.println("ritz acceleration");
			
		}
		
	}


	
	
	

public class Interfaceprogram {

	public static void main(String[] args) {
		Mycars ob1=new verna();
		ob1.acceleration();
		ob1.enginespeed();
		ob1=new ritz();
		ob1.acceleration();
		ob1.enginespeed();
		
		

	}

}
