package OOPS;

public interface Shape {

	int i=34;
	
	void calculateArea(int r);
}

class Circle implements Shape
{

	public void calculateArea(int r) {
		System.out.println("Area of Circle is :"+ (Math.PI*r*r));
		
	}
		public static void main(String[] args) {
			Shape s1 = new Circle();
			s1.calculateArea(2);
		}
	
}