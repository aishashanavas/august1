package jumpingstatements;

public class prgm1 {

	public static void main(String[] args) {
		
		
			for(int i=0;i<=10;i++)
			{
if(i==5)
{
	//break;
	continue;
}
	System.out.println(i);
			}
			
			
			//ip-3456
			//op-6543
			int n=3456;
			int reverse=0;
			while(n>0) //3456>0,
			{
				 int r=n%10; //3456%10=6,
			reverse=reverse*10+r; //0*10+6=6,
			n=n/10; //345,
			
			}
			System.out.println("reverse no="+reverse);
			
				
				
			
	}

}
