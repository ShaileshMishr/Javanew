package OOPS;

 class Student {

	//data: data members : instance variable
	int studentId;
	String studentName;
	String studentCity;
	
	// Default Constructor
	public Student() {
		this(96,"Test","City");
		System.out.println("creating object");
		//System.out.println(this.studentCity);
	}
	
	// Parameterized constructor
	public Student(int st) 
	{
		System.out.println("Parameterized constructor : (int)");
	}
	
	// Constructor Overloading
	public Student(int i, String studentName, String studentCity) {
		studentId=i;
		this.studentName=studentName;
		this.studentCity=studentCity;
	}
	
	
	
	// Behavior : member methods : methods:(function)
	
	public void study()
	{
		System.out.println(studentName + " is studying");
		// this keyword
		System.out.println(this.studentCity);
	}
	
	// Method Overloading
	public void study(float f)
	{
		
	}
	
	public void showFullDetails()
	{
		System.out.println("My name is " + studentName);
		System.out.println("My Id is " + studentId);
		System.out.println("My city is " + studentCity);
	}
	
	
}
