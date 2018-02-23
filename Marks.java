import java.util.*;
class Marks{
	public static void main(String args[]){
		int ar[]=new int[10];
		int i;
		String grade;
		Scanner sc= new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			System.out.println("Enter "+"marks "+(i+1));
			ar[i]= sc.nextInt();
		}

		Arrays.sort(ar);
		System.out.println("Marks "+"\t"+"Grades ");
		for(i=0;i<10;i++)
		{
			if(ar[i]<40){
				grade="Fail";
			}
			else if(ar[i]>=40 && ar[i]<50){
				grade="Pass";
			}
			else if(ar[i]>=50 && ar[i]<75){
				grade="Merit";
			}
			else{
				grade="Distinction";
			}
			System.out.println(ar[i] + "\t" + grade);
		}
	}
}