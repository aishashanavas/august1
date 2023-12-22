package p1;

import oops.Accessmodifiers;

 public class employee extends  Accessmodifiers {


int empid; //instance variable
String empname;
static String companyname="luminar"; //static variable


	public static void main(String[] args) {
		
		
		employee emp1=new employee();
		System.out.println(emp1.empid=101);
		System.out.println(emp1.empname="abc");

		employee emp2=new employee();
		System.out.println(emp2.empid=103);
		System.out.println(emp2.empname="arushi");

		Accessmodifiers ob=new Accessmodifiers();
		//System.out.println(ob.a);
		System.out.println(emp1.d);
		//ob.n();

	}



//public void bonusdetails()
//{
//	int bonus=5000; //local variable
 
}