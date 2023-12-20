package calc;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Please select operation.....");
	
		while(true) {
			System.out.println("Select 1 for ADDITON");
			System.out.println("Select 2 for SUBSTRACT");
			System.out.println("Select 3 for MULTIPLICATION");
			System.out.println("Select 4 for DIVIDE");
			 int ch = sc.nextInt();
	            //if (ch == 1) {
	                System.out.println("Enter first number :");
	                int n1 = sc.nextInt();
	                System.out.println("Enter second number :");
	                int n2 = sc.nextInt();
	                if (ch == 1) {
	                System.out.println("Addition of two number is :" + (n1+n2));
	                }
	                if (ch == 2) {
		                System.out.println("SUBSTRACTION of two number is :" + (n1-n2));
	                }
		                if (ch == 3) {
			                System.out.println("MULTIPLICATION of two number is :" + (n1*n2));
		                }
			                if (ch == 4) {
				                System.out.println("DIVIDE of two number is :" + (n1/n2));
			                }
	       
	
	            System.out.println("Enter Q to quite");
				char choice = sc.next().charAt(0);
				if(choice=='Q' || choice=='q') {
					break;
				}
	}
	}
}


	


