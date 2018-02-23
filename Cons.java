interface A
{
	int a =10; //constant value
}
class Cons implements A
{
 public static void main(String args[])
 {
  
   System.out.println("Constant value of a is = "+a);
   a++;
   System.out.println(a);
 }
}