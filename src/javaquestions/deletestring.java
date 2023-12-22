package javaquestions;

public class deletestring {

	public static void main(String[] args) {
		// string s="testing training centre"
		// op-centre training testing
		String s1 = "Testing Training Centre";
		String[] ar = s1.split(" ");
		for (int i = ar.length - 1; i >= 0; i--)
			
		{
			System.out.print(ar[i] + " ");

		}
	}
}
