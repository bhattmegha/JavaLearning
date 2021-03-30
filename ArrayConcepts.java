package javaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		//one dimensional arrays: 
		// 1. integer array
		
		System.out.println("printing integer array");
		
		int i[] = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		
		System.out.println(i[3]);
		
		System.out.println(i.length);  //print length of an array
		
		//print all the values of an array: always use FOR loop
		
		for (int j=0; j<i.length; j++)
		{
			System.out.println(i[j]);
		}
		
		System.out.println("printing double array");
		//2. double array
		
		double d[] = new double[3];
		d[0] = 12.12;
		d[1] = 13.13;
		d[2] = 14.14;
		
		for (int a = 0; a<d.length;a++) {
			
			System.out.println(d[a]);
			
		}
		
		System.out.println("Printing character array");
			// 3. char array
			
			char c[] = new char[5];
			c[0] = 'M';
			c[1] = 'E';
			c[2]='G';
			c[3]='H';
			c[4]='A';
			
			System.out.println("leghth of character array: " + c.length);
			
			for (int b=0;b<c.length;b++)
			{
				System.out.println(c[b]);
			}
		
			
			// 4. Boolean array
			System.out.println("printing boolean array");
			boolean b1[] = new boolean[2];
			b1[0]=true;
			b1[1]=false;
			
			for (int x=0;x<b1.length;x++)
			{
				System.out.println(b1[x]);
			}
			
			
			System.out.println("printing String array");
			
			//5. String array
			String s[]=new String[3];
			
			s[0]="Good ";
			s[1]="Morning ";
			s[2]="Canada";
			
			for (int y=0;y<s.length;y++)
			{
				System.out.println(s[y]);
			}
			
			System.out.println(s[0]+s[1]+s[2]);
			
			//6. Object Array : different data types values can be stored
			
			System.out.println("printing Object array");
			
			Object ob[] = new Object[5];
			ob[0]= "Megha";
			ob[1]= "Bhatt";
			ob[2]= 1994;
			ob[3]=12.24;
			ob[4]= 'f';
			
			for(int i1=0; i1<ob.length;i1++)
			{
				System.out.println(ob[i1]);
			}
			
			
		}

		
	}


