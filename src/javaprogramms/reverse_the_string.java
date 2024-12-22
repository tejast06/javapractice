package javaprogramms;

public class reverse_the_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//approach1
		String s = "abcd";
		String rev = "";
		int len = s.length(); //4
		for(int i=len-1; i>=0; i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
		//approach2
		
		
//		String s = "tejas";
//		String rev = "";
//		char a []  =   s.toCharArray();
//		for(int i=a.length-1; i<=0; i--) {
//			rev=rev+a[i];
//		}
//		System.out.println(rev);
		
		//approach3:string buffer class
		StringBuffer s1 = new StringBuffer("tej");
		System.out.println(s1.reverse());
		
		

	}

}
