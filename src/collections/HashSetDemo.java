package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet set = new HashSet();
		set.add(10);
		set.add(null);
		set.add(10.5);
		set.add(false);
		set.add(10.5);
		set.add(10);
		set.add(null);
		System.out.println(set); //[null, 10.5, false, 10]
		
		set.remove(10.5);
		
		//convert hashset to arraylist:
		ArrayList list = new ArrayList(set);
		
	Iterator it = 	set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}

	}

}
