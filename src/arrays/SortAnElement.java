package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a = {2,5,8,9,1};
		
		System.out.println("before sorting");
		System.out.println(Arrays.toString(a));
		
		System.out.println("after sorting");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

	}

}
