package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(12);
		list.add("kkhkhkh");
		list.add('w');
		System.out.println(list.size());
		list.add(1,"www");
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		for(Object i:list) {
			System.out.println(i);
		}
		
	    Iterator<Object> it = 	list.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
		
		

	}

}
