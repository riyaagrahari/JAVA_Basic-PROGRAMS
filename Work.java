import java.util.*;
class Worker
{
 static String name;
 static double salrate;
 void ComPay(int hours)
 {
 
 }
}
class DailyWorker extends Worker
{
	void ComPay(int hours)
	{
		double salary = salrate*hours;
		System.out.println("Category: DAILY WORKER");
		System.out.println("Name: "+name);
		System.out.println("Salary Rate: "+salrate);
		System.out.println("Salary (per week): "+salary);
	}
}
class SalariedWorker extends Worker
{
	void ComPay(int hours)
	{
		double salary = salrate*40;
		System.out.println("Category: SALARIED WORKER");
		System.out.println("Name: "+name);
		System.out.println("Salary Rate: "+salrate);
		System.out.println("Salary (per week): "+salary);
	}
}
class Work extends Worker
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter name: ");
	name =sc.next();
	System.out.println("Enter Salary rate: ");
	salrate= sc.nextDouble();
	System.out.println("Are you a daily worker(y/n)");
	char ch =sc.next().charAt(0);
	if(ch == 'y'||ch == 'Y')
	{
		Worker ob = new DailyWorker();
		System.out.println("Enter No. of hours you have worked in a week : ");
		int h= sc.nextInt();
		ob.ComPay(h);
	}
	else
	{
	Worker ob = new SalariedWorker();
	ob.ComPay(40);
	}
	
}
}