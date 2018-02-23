class Cal{
	public static void main(String args[]){
		double s;
		System.out.println("FIRST NUMBER = "+args[0]);
		System.out.println("SECOND NUMBER = "+args[1]);
		System.out.println("OPERATION TO BE PERFORMED = "+args[2]);
	
		switch (args[2]){
			case "+" : 
			{
				s=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
				System.out.println("Sum of "+args[0]+" and "+args[1]+" = "+s);
				break;
			}
			case "-" : 
			{
				s=Integer.parseInt(args[0])-Integer.parseInt(args[1]);
				System.out.println("Difference of "+args[0]+" and "+args[1]+" = "+s);
				break;
			}
			case "*" : 
			{
				s=(Integer.parseInt(args[0]))*(Integer.parseInt(args[1]));
				System.out.println("Product of "+args[0]+" and "+args[1]+" = "+s);
				break;
			}
			
			case "/" : 
			{
				s=Integer.parseInt(args[0])/Integer.parseInt(args[1]);
				System.out.println("Division of "+args[0]+" and "+args[1]+" = "+s);
				break;
			}
		}
	}
}
