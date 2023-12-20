package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

// import util package(All classes)


public class StartCode {

	public static void main(String[] args) {
		System.out.println("Welcome to code java collection framework");
		
		/*
		1) Type Safe- same type of elements(objects) are added to collection

		2) Un Type Safe- Different types of elements can be added to collection.
 		
 		*/

		// Type safe collection
		System.out.println(" type safe....");
		ArrayList<String> names = new ArrayList<String>();
		names.add("Shailesh");
		names.add("Shanu");
		names.add("Pooja");
		names.add("Priya");
		System.out.println(names);
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		names.add("Shailesh");
		System.out.println(names);
		
		// remove
		names.remove("Pooja");
		System.out.println(names);
		
		// size
		System.out.println("SIZE = "+names.size());
		
		// check item is there or not
		// type ka equals method call kerta hai checking ke liye
		System.out.println(names.contains("Pooja"));
		
		// check for empty
		System.out.println(names.isEmpty());
		
		// setting values
		// set replace the value 
		names.set(3, "Kishan");
		System.out.println(names);
		
		// add method add the value on that index it did not replace 
		names.add(2, "Guru");
		System.out.println(names);
		
		// remove all elements
		//names.clear();
		//System.out.println(names);
		
		// Add our array into vector
		System.out.println("Vector...");
		Vector<String> vector = new Vector<>();
		vector.addAll(names);
		System.out.println("VECTOR = " +vector);
		
		System.out.println("_____________________________________________________________");
		
		System.out.println("HasSet............");
		HashSet<Double> nms =new HashSet();
		nms.add(14.14);
		nms.add(34.55666);
		nms.add(2354.56677);
		nms.add(99.3);
		nms.add(99.3);
		nms.add(5.3);
		// It is unique , unordered and unsorted 
		
		System.out.println("HashSet = " +nms);
		
		System.out.println("_____________________________________________________________");
		
		TreeSet<Double> tset = new TreeSet<>();
		tset.addAll(nms);
		System.out.println("TreeSet = " + tset);
		//// It is unique and  sorted
		
		
		System.out.println("_____________________________________________________________");
		
		// Un Type Safe
		System.out.println("Un type safe....");
		LinkedList list = new LinkedList();
		list.add("Ram");
		list.add(1);
		list.add(344.5555);
		list.add('A');
		list.add(true);
		list.add("Ram");
		System.out.println(list);
		
	}

}
