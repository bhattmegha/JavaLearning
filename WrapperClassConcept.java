package oopConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String s = "200";
		System.out.println(s+100);
		
		//Data conversion- String-Integer
		System.out.println("after data conversion from string to integer");
		
		int i = Integer.parseInt(s);
		System.out.println(i+100);

		//String-Double
		
		String a = "20.34";
		System.out.println(a+40);
		
		System.out.println("after data conversion from string to double");
		
		double d = Double.parseDouble(a);
		System.out.println(d+40);
		
		String b = "True";
		System.out.println(b);
		
		// string-boolean
		System.out.println("after data conversion from string to boolean");
		boolean b1 = Boolean.parseBoolean(b);
		System.out.println(b1);
		
		
	}

}
