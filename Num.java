import java.util.*;
class Num
{
	int k=0;
	public void store(int ar[],int arr[])
	{

		  arr[k]=ar[2]*100+ar[1]*10+ar[0];
		  k++;
	}
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
	 int ar[] = new int[3];
	 int arr[] = new int[6];
	 for(int i =0;i<3;i++)
	 {
		System.out.println("Enter digit ");
		ar[i]=sc.nextInt();
		
		}
		System.out.println();
		Num ob=new Num();
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<2;j++)
		{
			int temp=ar[j];
			ar[j]=ar[j+1];
			ar[j+1]=temp;
			ob.store(ar,arr);
	
		}
	}
	String s1= Integer.toString(arr[0]);
	if(s1.length()==3)
	System.out.println(arr[0]);
	Arrays.sort(arr);
	for(int i =1;i<6;i++)
	{
		String s= Integer.toString(arr[i]);
		if(arr[i] != arr[i-1] && s.length()==3)
			System.out.println(arr[i]);

		}
	}
}