package javaBasics;

public class IncrementandDecrementOperator {

	public static void main(String[] args) {
		
		int i = 1;
		int j = i++; // this is called Post increment, here first the value of i will be given to j and then value of i will increase by 1
		
		System.out.println(i);
         System.out.println(j);
		
		int a = 1;
		int b = ++a;  // this is called PRE INCREMENT, the value of a will first increase and then will be given to b
		
		System.out.println(a);
		System.out.println(b);
	
	int x = 1;
	int y = x--;  //POST DECREMENT
	
	System.out.println(x);
	System.out.println(y);
	
	int p = 0;
	int q = --p;
	
	System.out.println(p);
	System.out.println(q);
	
	
	
	
	}
	

}
