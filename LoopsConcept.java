package javaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		
		//while loop
		
		int i = 0;  // this step is called initialization
		while (i<=10) {   //conditional step
			System.out.println(i);
			i++;  //incremental/decremental step
		}

		System.out.println("**************");
		
		// for loop
		//j++ = j+1
		for (int j=0; j<=10; j++) //initialization, conditional, incremental step
		{
			System.out.println(j);
		}
	
		System.out.println("numbers in descending order");
		//print from 10 to 1
		// a-- = a-1
		for (int a=10;a>=1;a--)
		{
			System.out.println(a);
		}
	}
	

}
