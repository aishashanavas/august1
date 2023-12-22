package oops;

import java.util.Scanner;

interface BankAccount
{
	public void accountdetails(String name);
	public void balance();
	public void deposit();
	public void withdraw();
}
class Sbi implements BankAccount
{
	static String bankname="sbi";
	int balance=10000;
	Scanner sc=new Scanner(System.in);
	int accountnumber;
	

	@Override
	public void accountdetails(String name) {
		System.out.println("enter your account number=");
		accountnumber=sc.nextInt();
		System.out.println("name="+name+"\n"+"your account no="+accountnumber+"\n"+"bankname="+bankname);
		}

	@Override
	public void balance() {
		System.out.println("balance amount="+balance);
		
		
	}

	@Override
	public void deposit() {
		System.out.println("enter your deposit amount");
		int dep=sc.nextInt();
		balance=balance+dep;
		System.out.println("after depositing your final balance="+balance);
		
	}

	@Override
	public void withdraw() {
		System.out.println("enter your withdrawl amount=");
		int withdraw=sc.nextInt();
		if (withdraw>balance)
		{
			System.out.println("insufficient balance");
		}
		else
			balance=balance-withdraw;
		System.out.println("after withdrawl your final balance="+balance);
	}


}

public class BankApplication {

	public static void main(String[] args) {
		 
Sbi a=new Sbi();
a.accountdetails("aisha");
a.balance();
a.deposit();
a.withdraw();


	}  

}
