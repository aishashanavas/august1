package oops;

public class Employee {
	 int empid;
	 String empname;
	 String empdesignation;
	 
	 public Employee(int empid,String empname,String empdesignation)
	 {
		this.empid=empid;
		this.empname=empname;
		this.empdesignation=empdesignation;
	 }
	 public void display(){
	System.out.println("empid="+empid);	 
	System.out.println("empname="+empname);
	System.out.println("empdesignation="+empdesignation);
	 }

	public static void main(String[] args) {
		Employee emp1=new Employee(101,"aisha","tester");
		emp1.display();

		Accessmodifiers ob=new Accessmodifiers();
	//	System.out.println(ob.a);
		System.out.println(ob.name);
	//	ob.d();
		//ob.n();
		
		
		//System.out.println(emp1.empid);

	}

}
