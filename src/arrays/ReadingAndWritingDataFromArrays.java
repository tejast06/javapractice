package arrays;

import java.util.Scanner;

public class ReadingAndWritingDataFromArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			System.out.println("enter a value:");
		      a[i]=	sc.nextInt();
		}

	}

}
