package javaprogramms;

public class palindrome_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "madam";
		String originalStrr =s;
		String rev = "";
		int len = s.length();
		for(int i=len-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		
		System.out.println("value is " +rev);
		if(originalStrr==rev) {
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("string is not palindrome");
		}

	}

}
