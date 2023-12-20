package Polymorphism;

public class Student {

	// Overloading
	public void read() {
		System.out.println("Stident is reading XYZ book");
	}
	
	public void read(String bookName)
	{
		System.out.println("Reading "+ bookName );
	}
}
