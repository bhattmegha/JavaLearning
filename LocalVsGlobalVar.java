package oopConceptPart1;

public class LocalVsGlobalVar {

	//declaring global variables
	
			String name = "Megha";
			int age = 27;
			char c = 'a';
	
	public static void main(String[] args) {
		
		//declaring LOCAL variablesof main method
		
		int i = 10;
		int b = 20;
		
		System.out.println(i+b);
		
		//creating OBJECT to call global variables
		
		LocalVsGlobalVar obj = new LocalVsGlobalVar();
		System.out.println(obj.c);
		System.out.println(obj.age);

	}

	public void sum() {
		
		//LOCAL variables of sum method
		int i = 20;
		int x= 40;
		
		
	}
	
	
	
	
}


