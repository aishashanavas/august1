package oops;
class Member
{
	String name;
	int age;
	long phoneno;
	String address;
	int salary;
	public void printdetails()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phoneno="+phoneno);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
	}
}
	class Employee4 extends Member
	{
		
			String specialisation;
	
		}
		class Manager extends Member
	
			{
				String department;
			}
		



public class Inheritanceprogram {

public static void main(String[] args) {
	Employee4 ob=new Employee4();
	ob.name="arathy";
	ob.age=23;
	ob.phoneno=9895667744l;
	ob.address="abc";
			ob.salary=90000;
	ob.printdetails();
	System.out.println(ob.specialisation="java");
		
	Manager m=new Manager();
	m.name="aisha";
	m.age=22;
	m.phoneno=8895667744l;
	m.address="dfe";
	m.salary=67000;
	m.printdetails();
	System.out.println(m.department="tester");
	

	}

}
