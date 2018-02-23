import java.util.*;
class Trunk
{
	int m;
	void charge(int c)
	{
	}
}
class Ordinary extends Trunk
{
	void charge(int c)
	{
		System.out.println("Charge = "+(c*m)+" Rupees (2 Rs. per min.)");
	}
}
class Urgent extends Trunk
{
	void charge(int c)
	{
		System.out.println("Charge = "+(c*m)+" Rupees (1 Rs. per min.)");

	}
}
class Lightning extends Trunk
{
	void charge(int c)
	{
		System.out.println("Charge = "+(c*m)+" Rupees (0 Rs. per min.)");
	}
}
class Calls 
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	
	
	System.out.println("Enter type of call encountered(O for Ordinary,U for Urgent and L for Lightning");
	char ch =sc.next().charAt(0);
	if(ch == 'O')
	{
		Trunk ob = new Ordinary();
		System.out.println("Enter call duration(in minutes)");
		ob.m = sc.nextInt();
		ob.charge(2);
	}
	else if(ch == 'U')
	{
	
		Trunk ob1 = new Urgent();
		System.out.println("Enter call duration(in minutes)");
		ob1.m = sc.nextInt();
		ob1.charge(1);
	
	
	}
	else{
	
	Trunk ob2 = new Lightning();
	System.out.println("Enter call duration(in minutes)");
		ob2.m = sc.nextInt();
		ob2.charge(0);
	
	
	}
	
}
}