package First.Java;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Age is more than 12 and name starts with s.............");
			
			System.out.println("Enter your Age....");
			int age=sc.nextInt();
			
			System.out.println("Enter your Name....");
			String name=sc.next();
			
			
			if(age>12 && name.startsWith("s")){
				System.out.println("Welcome");
			}
			
			else {
				System.out.println("Wrong Input....");
			}
			
			System.out.println("Enter Q to quite");
			char choice = sc.next().charAt(0);
			if(choice=='Q' || choice=='q') {
				break;
			}
			
		}
		
		

	}

}
