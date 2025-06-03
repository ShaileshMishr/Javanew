package day1;

class Calculator{
	
	public int add(int n1, int n2) {
		
		int r=n1+n2;
		return r;
		
	}
}


public class Object {

	public static void main(String[] args) {
		
		int num1=4;
		int num2=5;
		
		Calculator calc = new Calculator();
		
		int result = calc.add(num1,num2);
		
		System.out.println(result);
		
	}

	

}

// We are compile the code with the help of JDK which converts the code into byte code. We are run the code in the JVM.
// JRE Java Runtime Environment - We need some extra files or classes to run the code this will provide by JRE.


//You will create a class file and this class file get compiled and create a byte code. That byte code goes to the JVM and you get the object.
		// JVM will creates a object

		// Object having some properties and behaviours.
		// class is a blueprint of object.
		
		