package javaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		
		int a = 100;
		int b = 200;
		
		if (a>b)
		{
			System.out.println("a is greater then b");
		}
		
		else
		{
			System.out.println("b is greater then a");
		}
		
		int a1 = 50;
		int a2 = 50;
		
		if (a1==a2)
		{
			System.out.println("a1 is equal to a2");
		}
		else
		{
			System.out.println("a1 is not equal to a2");
		}
		
		//comparison operators: >,<,==, <=,>=, !=
		//logic to find out the highest number
		
		int x = 300;
		int y = 200;
		int z = 400;
		
		if (x>y & x>z) // false & true = false; false &false = false; True&true = true
		{
			System.out.println("x is the highest" + x);
		}
		else if (y>z)
		{
			System.out.println("y is the highest"+ y);
		}
		else
		{
			System.out.println("z is the highest"+ z);
		}
	}

}
