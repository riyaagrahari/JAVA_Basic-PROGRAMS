class Add{
	public static void main(String args[]){
		System.out.println("Command Line Input 1: "+args[0]);
		System.out.println("Command Line Input 2: "+args[1]);

		int s;
		s=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
		System.out.println("Sum of "+args[0]+" and "+args[1]+" "+"="+" "+s);
	}
}