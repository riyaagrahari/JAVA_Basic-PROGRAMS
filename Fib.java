class Fib{
	public static void main(String args[]){
		int i,n,a=0,b=1,c;
		n=Integer.parseInt(args[0]);
		System.out.println("Numbers of terms till which Fibonacci will be generated is "+n);
		System.out.print(a+" "+b+" ");
		for(i=1;i<=n-2;i++){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
