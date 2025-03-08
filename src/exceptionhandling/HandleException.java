package exceptionhandling;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program is started..");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
	    int num = 	sc.nextInt();
	    
	    try {
	    System.out.println(100/num);
	    }catch(ArithmeticException e){
	    	System.out.println("invalid data");
	    	
	    }
	    
	    
	    
	    System.out.println("program is completed");
	    System.out.println("program excited");

	}

}
