package pkg;

public class operators {

	public static void main(String[] args) {
		//arithmetic operators
		int a=30,b=20;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));//quotient
		System.out.println("a%b="+(a%b));//reminder
		
		//assignment operator
		int c;
		System.out.println(c=b);
		System.out.println(a+=b);// a=a+b 30+20
		System.out.println(a-=b);//a=a-b 50-20 
		
		//relational operator(>,<,>=,<=,!=,==)
		int v1=30,v2=10;
				System.out.println(v1>v2);
		System.out.println(v1<v2);
		System.out.println(v1>=v2);
		System.out.println(v1<=v2);
		System.out.println(v1==v2);
		System.out.println(v1!=v2);
		
		//Logical operator(&&,||,!)
		//   A  B   A&&B   A||B  !A  !B
		//   1  1     1      1    0   0
	  //     1  0     0      1    0   1
	 //	     0  1     0      1    1   0
	//	     0  0     0      0    1   1
		String username="abc";
		String pswd="abc123";
		
		 System.out.println(username=="abc" && pswd=="abc12");
		 System.out.println(username=="ab" || pswd=="abc123");
		 System.out.println(!(username=="abc"));

		 
		 //unary operator(++,--)
		 // ++ -increment by 1
		 // --  decrement by 1
		 
		 int v=5;
		 System.out.println(v++);//5
		 System.out.println(v);//6
		 System.out.println(++v);//7
		 
		//ternary operator
		 
		 //variable=condition?exp1:exp2
		 String n=a<b?"b is greater":"a is greater";
		 System.out.println(n);
		

	}

}
