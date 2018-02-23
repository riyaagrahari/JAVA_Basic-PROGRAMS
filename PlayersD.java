import java.util.*;
class Player{
	String name;
	int age;
	void display(){
		
	}
}
class Cricket_Player extends Player{
	int r=5000;
	void display(){
		
		System.out.println("Cricket Player :"+name+" "+age+" "+r);
	}
}
class Football_Player extends Player{
	int g=40;
	void display(){
		
		System.out.println("Football Player :"+name+" "+age+" "+g);
	}
}
class Hockey_Player extends Player{
	int b=20;
	void display(){
		System.out.println("Hockey Player :"+name+" "+age+" "+b);
	}
}
class PlayersD{
	public static void main(String args[]){
		Player h = new Hockey_Player();
		Player f = new Football_Player();
		Player c = new Cricket_Player();
		c.name="Rahul";
		c.age=30;
		h.name="John";
		h.age=30;
		f.name="Rohan";
		f.age=32;
		
		c.display();
		f.display();
		h.display();
	}
}