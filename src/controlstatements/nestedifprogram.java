package controlstatements;

public class nestedifprogram {

	public static void main(String[] args) {
		int age=19,weight=48;
		if (age>=18)
			if(weight>45) {
				System.out.println("eligible for blood donation");
			}
			else {
				System.out.println("weight should be above 45");
			}
		else {
			System.out.println(" age should be above or equal to 18");
		}

	}

}
