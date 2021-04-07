package oopConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum("megha");
		obj.sum(50, 50);
		

	}

	// method overloading: creating same name methods with different arguments and different data types.
	public void sum() {
		
		System.out.println("1st method with 0 argument");
	}
	
	public void sum(int x) {
		System.out.println("2nd method with 1 argument");
		System.out.println(x);
		}
	
	public void sum(int x,int y) {
		
		System.out.println("3rd method with 2 arguments");
		System.out.println(x+y);
		
	}
	
	public void sum(String s) {
		System.out.println("4th method with 1 argument");
		System.out.println(s);
	}
	
	
	
	
	
}

