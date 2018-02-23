import java.util.*;
interface test
{
	public int square(int c);
}
class Arithmetic implements test
{
	public int square(int c)
	{
		return(c*c);
	}
}
class ToTestInt
{
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
 Arithmetic ob = new Arithmetic();
 System.out.println("Enter a number whose square has to be calculated");
 int a =sc.nextInt();
 int s=ob.square(a);
 System.out.println("Square of "+a+" is = "+s);
}
}