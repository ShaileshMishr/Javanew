package Day1;

import java.util.Scanner;

public class switchex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter day: ");
		String day= sc.next();
		
		switch(day) {
		case "MON":
			System.out.println("It is monday");
			break;
			
		case "TUES":
			System.out.println("It is tuesday");
			break;
		case "WED":
			System.out.println("It is wednesday");
			break;
			
		default :
			System.out.println("Invalid day");
		}

	}

}
