package oops;
class Emp
{
private String empname;
private int age;
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
public class Empcappgm {

	public static void main(String[] args) {
		Emp ob=new Emp();
		ob.setEmpname("aisha");
		System.out.println(ob.getEmpname());
		ob.setAge(23);
		System.out.println(ob.getAge());
		
	}

}
