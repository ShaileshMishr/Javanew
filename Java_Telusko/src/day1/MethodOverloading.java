package day1;

	class Calculator1{
		
		public int add(int n1, int n2) {
			return n1+n2;
		}
		
		public int add(int n1, int n2, int n3) {
			return n1+n2+n3;
		}
		
		public double add(double n1, int n2) {
			return n1+n2;
		}
	}


public class MethodOverloading {

	public static void main(String[] args) {

		Calculator1 c= new Calculator1();
		int sum =c.add(2, 3);
		System.out.println(sum);
		
		int sum1 = c.add(2,3,4);
		System.out.println(sum1);
		
		double sum2=c.add(2.4, 4);
		System.out.println(sum2);
		


	}

}
