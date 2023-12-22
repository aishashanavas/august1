package oops;

public class Accessmodifiers {
	private int a=10;
	String name="aysha";
	protected int d=50;
	public int n=3;

	public static void main(String[] args) {
	
		Accessmodifiers ob=new Accessmodifiers();
		System.out.println(ob.a);
//ob.name();
		ob.d();
		ob.n();
	}

}
