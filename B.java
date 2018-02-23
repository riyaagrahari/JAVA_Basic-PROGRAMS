
class A
{
	 
		String s ="RIYA";
		int a =2;
		float b=9.6f;
		double e=7.89;
}
class B
{
	public static void main(String args[])
	{
		A ob = new A();
		System.out.println("Your Name :"+ob.s);
		System.out.println("Your Entered float value :"+ob.b);
		System.out.println("Your Entered double value :"+ob.e);
	}
}