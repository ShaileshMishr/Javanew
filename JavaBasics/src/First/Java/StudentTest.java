package First.Java;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Name, RollNo, Grade for 5 Students :");

	        Student[] students = new Student[5];

	        Student[] topStudents = new Student[5];

	        // Creating ARRAY of students with user input values

	        for(int i=0; i<5; i++) {
	            System.out.println("Enter Name for student "+(i+1));
	            String name = sc.next();
	            System.out.println("Enter RollNo for student "+(i+1));
	            int rollNo = sc.nextInt();
	            System.out.println("Enter Grade for student "+(i+1));
	            char grade = sc.next().charAt(0);

	            students[i] = new Student(name, rollNo, grade);
	        }

	        System.out.println("Student array is created ::");
	        System.out.println("Checking for grade now.....");

	        // Filter the array and store in the new array
	        int k=0;
	        for(int i=0; i<5; i++) {
	            if(students[i].getGrade()=='A') {
	                topStudents[k] = students[i];
	                k++;
	            }
	        }

	        // Display the new array
	        for(int i=0; i<5; i++) {
	            if(topStudents[i]==null) {
	                continue;
	            }
	            System.out.println(topStudents[i]);
	        }
	    }

	}


