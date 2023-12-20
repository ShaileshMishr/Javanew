package OOPS;

public class StudentMain {

	public static void main(String[] args) {
		
		// Now creating object of student
		Student st1;
		st1=new Student();
		
		st1.studentName="Ram";
		st1.studentId=12;
		st1.studentCity="Lucknow";
		
		System.out.println("First Object....");
		st1.study();
		st1.showFullDetails();
		System.out.println("First object end...........");
		
		
		Student st2= new Student(741,"SHYAM","Lucknow");
		
//		st2.studentName="Shailesh";
//		st2.studentCity="Pune";
//		st2.studentId=123;
		System.out.println("Second Object....");
		
		st2.study();
		st2.showFullDetails();
		System.out.println("Second object end...........");
		
		// In java using one class we can make lots of object.
		
	}

}
