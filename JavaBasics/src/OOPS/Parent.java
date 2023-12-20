package OOPS;

public class Parent {

	// overridden method
	public void m1()
	{
		System.out.println("I am m1() of parent");
	}
}

// Accessibility level
// public > protected > default > private

class Child extends Parent
{
	
	// overriding method
	public void m1() {
		System.out.println("I am m1 of child");
	}
}

// Important things for Overriding
//Argument same
//method name same
//return type same
//Co-varient return types are allow
// In child class we didn't use less accessbility