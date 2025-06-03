package day1;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name= sc.next();
		System.out.println("Enter your ID : ");
		int id= sc.nextInt();
		
		if(name.equals("Shailesh") || id==1) {
			System.out.println("Hello " + name);
		}
		else {
			System.out.println("Bye");
		}
		
		
		// Ternary operator
		System.out.println("----Ternary opr ---------");
		
		int n=5;
		int res = 0;
		
//		if(n%2==0) {
//			res=10;
//		}
//		else {
//			res=20;
//		}
		
		res=n%2==0 ?10:20;
		
		System.out.println(res);
		
		
	}

}
