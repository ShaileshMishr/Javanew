package OOPS;

abstract public  class MyClass {
	
	// complete method
	public void cal()
	{
		System.out.println("calculating results");
	}

	// abstract method
	abstract public void lauchRocket();
	
}



// abstract class can not be instaniated

class Start
{
	public static void main(String[] args) {
		// we did not make a object of abstract class
		//MyClass myClass = new MyClass();
		
		MyChild myChild = new MyChild();
		myChild.lauchRocket();
		myChild.cal();
		
		
	}
}