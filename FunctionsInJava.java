package oopConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {

	
		// creating object
		// object== new FunctionsInJava()
		// reference variable == obj
		FunctionsInJava obj = new FunctionsInJava();
		// after creating this object, copy of all non static method will be given to this object.
		
		String s1 = obj.abc();
		System.out.println(s1);
		
		obj.test();
		
		int c1 =obj.qa();
		System.out.println(c1);
		
		int z1 = obj.xyz(4, 2);
		System.out.println(z1);
          
	}

	//non static method
	// public = publically available method
	// void = does not return value
	// test == method name
	//return type of test = void
	public void test() {  //NO INPUT NO OUTPUT
		
		System.out.println("test method");
		
	}
	
	// return type of qa methods = int
	//qa is the method name
	public int qa() {     // NO INPUT SOME OUTPUT
		
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}	
	
	// return type of abc = String
		public String abc() {     //NO INPUT SOME OUTPUT
			
			System.out.println("abc method");
			 String s = "Megha";
			 
			 return s;
			
		}
		
		//return type of xyz = int
		// x,y ==> input parameter/arguments
		public int xyz(int x, int y) {    //SOME INPUT SOME OUTPUT
			
			System.out.println("xyz method");
			
			int z=x/y;
			
			return z;
		}
	}



