package day1;

public class Opr {

	public static void main(String[] args) {

// relational operator
		int x=6;
		int y=8;
		
		boolean result = x>y;
		boolean result1 = x<y;
		boolean result2 = x>=y;
		boolean result3 = x<=y;
		boolean result4 = x==y;
		boolean result5 = x!=y;
		
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		// logical operator
		
		int a =5;
		int b= 3;
		
		boolean res= x>y && b<a;
		boolean res1= x<y && b<a;
		
		boolean res2=  x>y || b<a;
		boolean res3= x<y || b<a;
		System.out.println("Logical opr---------");
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
	}

}
