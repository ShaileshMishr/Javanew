package Polymorphism;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("This is just Testing");
		
		Student student = new Student();
		student.read();
		//Compile time polymorphism
		student.read("Think Python");
		
		
		// Overriding
		
		Person person =new Emp();
		person.showDetail();
		
		// Run time polymorphism
		Person p1 = new Shyam();
		
		Ram ram = new Ram();
		ram.doWork(p1);
		
		
		
	}

}
