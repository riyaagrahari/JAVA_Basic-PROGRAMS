class Sum{
	public static void main(String args[]){
		int i;
		int s=0;
		
		for(i=45;i<250;i++){
			if(i%5==0){
			s= s+i;}
		}

		System.out.println("Sum of number divisible by 5 between 41 and 249 is: " + s);
	}
}