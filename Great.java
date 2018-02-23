import java.util.Scanner;

class Great
 {
	public static void main(String args[])
	{
	int a,b,c;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter first number");
	a= sc.nextInt();
	System.out.println("Enter second number");
	b= sc.nextInt();
	System.out.println("Enter third number");
	c= sc.nextInt();

	if(a>b && a>c)
	{System.out.println("Greatest number is "+ a);}
	else if(b>c)
	{System.out.println("Greatest number is "+ b);}
	else
	{System.out.println("Greatest number is "+ c);}
	}
}