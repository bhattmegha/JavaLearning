package oopConceptPart1;

public class StaticAndNonstatic {

	// declaring global variables
	
	String s = "Bhatt";  // non static global variable
	static int a = 104874;  // static global variable
	
	public static void main(String[] args) {
	 
		//calling static variables and methods
		// 1. DIRECT calling
		System.out.println("printing static variables and methods by direct calling");
		method();
		System.out.println(a);
		
		//2. calling by class name
		System.out.println("printing static variables and methods by calling class");
		StaticAndNonstatic.method();
		System.out.println(StaticAndNonstatic.a);
		
		System.out.println("*************");
		System.out.println("Printing non static variables and methods");
		
		//calling non static variables and methods
		//1. creating an object
		
		StaticAndNonstatic obj = new StaticAndNonstatic();
		
		System.out.println(obj.s);
		obj.sum();
		

	}

	
	public void sum() {
		
		int q = 30;
		int p = 60;
		
		System.out.println(p-q);
	}
	
	public static void method() {
		
		System.out.println("this is a static method");
		
		int x = 10;
		int y = 20;
		System.out.println(y*x);
	}
}
