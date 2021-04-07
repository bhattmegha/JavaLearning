package oopConceptPart1;

public class Car {

	// defining global/class variables
	
	int mod;
	int wheel;
	
	
	public static void main(String[] args) {
	
		//new car() == this is the Object of a Car class
		// creating objects
		//a,b,c == object reference names
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();

		
		//Initializing the variables
		
		a.mod= 2020;
		a.wheel=4;
		
		b.mod=2021;
		b.wheel=4;
		
		c.mod=2019;
		c.wheel=4;
		
		System.out.println(a.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		
		//shifting of Object reference from one object to another
		
		a=b;
		b=c;
		c=a;
		
		a.mod = 1081;
		System.out.println(a.mod);
		c.mod = 2030;
		System.out.println(a.mod);
		System.out.println(c.mod);
	}

}
