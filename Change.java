interface A
{
	public void division(int a,int b);
	public void modules(int a,int b);
}
class Op implements A
{
	public void division(int a,int b)
	{
		double r = a/b;
		System.out.println("Division of a and b result to "+r);
	}
	public void modules(int a,int b)
	{
		double r = a%b;
		System.out.println("Modulo of a and b result to "+r);
	}
	}
class Change extends Op
{
	public void division(int a,int b)
	{
		System.out.println("Dont want to perform division");
	}
	public void modules(int a,int b)
	{
	
		System.out.println("Dont want to perform division");
	}
	public static void main(String args[])
	{
		Op o = new Op();
		o.division(5,4);
		o.modules(7,5);
		Change ob = new Change();
		ob.division(5,4);
		ob.modules(7,5);
		}
	
}