package javaprogramms;

public class palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 132;
		int originalnum = num;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(originalnum == rev) {
			System.out.println("num is palindrome");
		}
		else {
			System.out.println("num is not palindrome");
		}
		
		

	}

}
