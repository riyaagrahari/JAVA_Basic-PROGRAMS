import java.util.Scanner;
class ArraySum{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int ar[]= new int[10];
		int s[]= new int[10];
		int i;
		int sum=0;
		
		System.out.println("Enter the 10 numbers:");
		
		for(i=0;i<10;i++){
			ar[i]=sc.nextInt();
		}
		
		System.out.println("NUMBERS\tSQUARE");
		for(i=0;i<10;i++){
			s[i]= ar[i]*ar[i];
			System.out.print(ar[i]+"\t"+s[i]+" ");
						sum= sum+s[i];

		}
		System.out.print("\n");
		System.out.println("Sum of squares is: " + sum);
	}
}