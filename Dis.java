interface A
{
	public void display();
}
interface B
{
	public void display();
}
class Dis implements A,B
{
	public void display()
	{
		System.out.println("THIS IS DISPLAY FUNCTON");
	}
 public static void main(String args[])
 {
	Dis ob = new Dis();
	ob.display();
 }
}