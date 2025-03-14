package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "jjhjh");
		hm.put(2, "ffggg");
		hm.put(3, "jjhggggjh");
		System.out.println(hm);
		
		//hm.remove(3);
		hm.get(1);
		System.out.println(hm.keySet());//return only keys
		System.out.println(hm.values());//return only values
		System.out.println(hm.entrySet()); //return keys and values
		
		for(int k:hm.keySet()) {
			System.out.println(k +"   "+ hm.get(k));
		}
		
	    Iterator<Entry<Integer, String>>	it=hm.entrySet().iterator();
	    while(it.hasNext()) {
	    Entry<Integer,String>entry=	it.next();
	    System.out.println(entry.getKey()+ "   "+ entry.getValue());
	    }

	}

}
