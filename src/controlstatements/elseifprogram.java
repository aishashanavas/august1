package controlstatements;

public class elseifprogram {

	public static void main(String[] args) {
		int a=8,b=17,c=15;
		if(a>b && a>c) {
			System.out.println("a is greater");
		}
		else if(c>a && c>b) {
			System.out.println("c is greater");
		}
		else  {
			System.out.println("b is greater");
		}
	
	}

}
