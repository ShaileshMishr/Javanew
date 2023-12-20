package Collection;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		
		HashMap<String,Integer> courses = new HashMap<>();
		
		// adding element
		courses.put("Core Java", 4000);
		courses.put("Python", 3500);
		courses.put("Spring", 8000);
		courses.put("Android", 2500);
		courses.put("Android", 1000);
		courses.put("PHP", 500);
		
		System.out.println(courses);
		
		System.out.println("_______________________________");
		
		// for each
		System.out.println("Traverse using for each method....");
		courses.forEach((e1,e2)->{
			System.out.println(e1+"=>"+e2);
		});
		
		System.out.println("_______________________________");

		// for each another type
		courses.forEach((key,value)->{
			System.out.print(key);
			System.out.println("=>");
			System.out.println(value);
			System.out.println();
		});
		
		// using key get the value
		System.out.println("Value of Core Java  = " +courses.get("Core Java"));
		

	}

}
