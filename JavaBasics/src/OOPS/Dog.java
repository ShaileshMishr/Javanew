package OOPS;

public class Dog extends Animal{
	
	public Dog() {
		// first line
		super();
		System.out.println("work");
		
		// not work
		//super();
		
	}
	
	int x=4;
	public void speak()
	{
		
		// parents
		System.out.println(super.x);
		
		// current class
		System.out.println(this.x);
	}
	

}
