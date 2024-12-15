package javaprogramms;

public class reverse_the_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcd";
		String rev = "";
		int len = s.length(); //4
		for(int i=len-1; i>=0; i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		

	}

}
