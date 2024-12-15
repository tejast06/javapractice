package javaprogramms;

import java.util.Scanner;

public class Reverse_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10; // 0*10+1234%10=4, 40+123%10=43, 430+12%10=432, 4320+1%10=4321
			num=num/10;              //123          12              1               0
		}
		System.out.println("reverse value is " +rev);
		
		//String buffer:
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		sb.reverse();

	}

}
