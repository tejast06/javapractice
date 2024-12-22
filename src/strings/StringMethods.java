package strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//concat
		String s1 = "welcome";
		String s2 = "wel";
		String s = "wee";
		 String s3 =  s1.concat(s2).concat(s);
		 
		 //trip-remove spaces in string
		 String s4 = "welcome ";
		//String trim =  s4.trim();
		 //System.out.println(trim.length());
		 
		 //charAt: return a character from a string based on index.
		 
		 System.out.println(s4.charAt(2));
		 
		 //contains
		 
		 String s6 = "welcome to the jungle";
		 System.out.println(s6.contains("jungle"));
		 
		 //equals, equalIgnoreCase
		 
		 String s7 = "welcome";
		 String s8 = "welcome";
		 String s9 = "Welcome";
		 System.out.println(s7.equals(s8));
		 System.out.println(s7.equalsIgnoreCase(s9));
		 
		 //replace:
		 String s10 = "welcome to welcome here";
		 System.out.println(s10.replace('e', 'B'));
		 
		 //substring- extract substring from the main string.
		 String s11 = "welcome";
		 System.out.println(s11.substring(1,3));
		 
		 String s12 = "abcaccc";
		 System.out.println(s12.replace('a', 'z').replace('c', 'Y'));
		 
		 //split
		 String s13 = "abc@gmail.com";
		String [] arr =  s13.split("@");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		String s14 = "$15,20,25";
		System.out.println(s14.replace('$', ' ').replace(',', ' ').trim());
		
//		String s15 = "abc,xyz@gmail.com";
//	    String[] arr1 = 	s15.split(",");
//	    System.out.println(Arrays.toString(arr1)); // abc xyz@gmail.com
//	    
//	    String[] arr2 =  arr[1].split("@");
//	    System.out.println(Arrays.toString(arr2)); //xyz,gmail
//	    
//	    System.out.println(arr1[0]);
//	    System.out.println(arr2[0]);
//	    System.out.println(arr2[1]);
	    
	    String s16 = "abc 123";
	   String[] arr3 =  s16.split(" ");
	   System.out.println(Arrays.toString(arr3));
	   
	   String s17 = "John keneddy";
	   
	   System.out.println(s17.replace('J', 'j').contains("john"));
	    
	    
	    
		
		 
		 
		 
		 

	}

}
