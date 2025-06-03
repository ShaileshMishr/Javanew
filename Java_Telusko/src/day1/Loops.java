package day1;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		// For Loop-----------------------------
		
		Scanner sc =new Scanner(System.in);
//		int i =0;
//		
//		System.out.println("What you want to print : ");
//		String s=sc.next();
//		System.out.println("How many times you want to print :");
//		int n=sc.nextInt();
		
		// For loop
		
//		for(int i=1;i<=n;i++) {
//			System.out.println(s);
//		}
		
		// while loop------------------------------
		
//		while(i<n) {
//			System.out.println(s+ " " +i);
//			
//			int j=1;
//			while(j<=3) {   // inner loop
//				System.out.println("Hello");
//				j++;
//			}
//			
//			i++;
//		}
		
//		System.out.println("Bye " + i);
		
		
		// do while loop----------------------------------------
		
//		do{
//			System.out.println(s);
//			i++;
//			}
//		while(i<n);
//		
		
		// for loop 
		
		for(int i=1;i<=5;i++) {
			System.out.println("DAY " + i);
			
			for(int j=1; j<=9;j++) {             // inner for loop
				
				System.out.println(" " + (j+8) + " - " + (j+9));
				
			}
		}
		
		int a,b;
		a=b=10;
		System.out.println(a);
		System.out.println(b);
		
	}
}
