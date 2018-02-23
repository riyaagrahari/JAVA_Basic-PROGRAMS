interface A
{
	public void meth1();
	public void meth2();
	
}
class MyClass implements A
{
	public void meth1()
	{
		System.out.println("This is method 1");
	}
	public void meth2()
	{
		System.out.println("This is method 2");
	}
	public static void main(String args[])
	{
		MyClass ob = new MyClass();
		System.out.println("Interface implementation --");
		ob.meth1();
		ob.meth2();
	}
}