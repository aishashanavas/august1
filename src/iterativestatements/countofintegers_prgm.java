package iterativestatements;

public class countofintegers_prgm {

	public static void main(String[] args) {
		// 5686
		int n=5686;
		int c=0;
		while(n>0)
		{
			n=n/10;//5686/10=568;568/10=56;56/10=5;5/10=0
			c++;//c=1;c=2;c=3;c=4
		}
		System.out.println("count="+c);		

	}

}
