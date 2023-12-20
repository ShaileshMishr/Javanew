package Generic;
import java.util.*;

public class Demo {

	public static void main(String[] args) {

		
		// Generic list
		List<String> list = new ArrayList<>();
		list.add("Ram");
		// list.add(1); // error
		System.out.println(list);
		
		// Non Generic list
		List anotherList = new ArrayList<>();
		anotherList.add("Kishan");
		anotherList.add(2);
		anotherList.add(12.55);
		System.out.println(anotherList);

		
	}

}
