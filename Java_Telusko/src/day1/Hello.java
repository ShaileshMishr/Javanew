package day1;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		// variable
		int num = 3;
		int num1=5;
		int sum= num+num1;
		System.out.println(sum);
		
		// datatype
		
		float marks=6.5f;
		byte by= 127;
		short sh =456;
		long l=234657676l;
		int n = 42;
		
		double d=4.5;
		
		char c='k';
		boolean b= true;
		
	// literals
		int num2=0b101;
		System.out.println(num2);
		
		int num3=100_00_00_000;
		System.out.println(num3);
		
		double num4=12e10;
		System.out.println(num4);
		
		// Type Casting
		
		byte b1=127;
		int a1=b1;
		System.out.println(b1);
		System.out.println(a1);
		
		int a2=258;
		byte b2= (byte) a2;    // explicit conversion
		System.out.println(b2);  // we loss some data due to type casting
		
		// Arithmetics Operators
		
		int n1=7;
		int n2=5;
		
		int res=n1*n2;
		int res1=n1+n2;
		int res2=n1-n2;
		int res3=n1/n2;
		int res4=n1%n2;
		int res5=n1+2;
		
		
		System.out.println("-------Arithmetics Operators------");
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
		
		--n1;
		++n2;
		
		System.out.println(n1);
		
		System.out.println(n2);
		
		

	}

}
