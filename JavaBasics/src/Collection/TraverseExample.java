package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Shaile");
		names.add("Shanu");
		names.add("Pooja");
		names.add("Priya");
		names.add("Shaile");
		names.add("ABC");
		
		// traversing using for each loop;
		System.out.println("Using For Each Loop.........");
		for(String str: names)
		{
			System.out.print(str +"\t"+str.length()+"\t");
			
			// In reverse order
			StringBuffer br = new StringBuffer(str);
			System.out.println(br.reverse());
		}
		System.out.println("_____________________________________________________________");
		
		// traversing using ITERATOR : Forward traversing
		System.out.println("Using Iterator....");
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext())
		{
			String next = itr.next();
			System.out.println(next);
		}
		
		System.out.println("============================================");
		
		// backword traversal of collection LISTITERATOR
		System.out.println("Using LISTITERATOR......");
		ListIterator<String> litr = names.listIterator(names.size());
		while(litr.hasPrevious())
		{
			String previous = litr.previous();
			System.out.println(previous);
		}
		System.out.println("============================================");

		// for each method
		System.out.println("Using for each method....");
		names.forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("SORTING OF ELEMENTS");
		// TreeSet
		
		TreeSet<String> set = new TreeSet<>();
		set.addAll(names);
		set.forEach(e->{
			System.out.println(e);
		});
	}

}
