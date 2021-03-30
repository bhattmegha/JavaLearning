package javaBasics;

public class StringConcatination {

	public static void main(String[] args) {
		
		//println is used to print the output in console with a new line
		//print is used to print the output in console without a new line
		int a = 10;
		int b = 20;
		
		String s = "Hello ";
		String s1 = "World";
		 
		// + is concatenation operator 
		System.out.println(a+b);
		System.out.println(s+s1);
		System.out.println(a+b+s+s1);
		System.out.println(s+s1+a+b);
		System.out.println(s+s1+(a+b));
		System.out.println("the total is:"+ a+b);
		System.out.println("sum is:" +(a+b));
		

	}

}
