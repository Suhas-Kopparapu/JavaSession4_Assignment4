package Session4;

public class Polymorphism {

	Polymorphism(int arg1){
	System.out.println("The area of Square is  "+(arg1*arg1));	
		
	}
	Polymorphism(int arg1,int arg2){
		System.out.println("The area of rectangle "+(arg1*arg2));
	}
	public static void main(String[] args){
		Polymorphism p1 = new Polymorphism(5);
		Polymorphism p2 = new Polymorphism(5,10);
		
	}
}
