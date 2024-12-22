package strings;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "tejas";
		String s2 = "tejas";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("tej");
		String s4 = new String("tej");
		System.out.println(s3==s4);// compare the objects.
		System.out.println(s3.equals(s4));// compare the value of the objects.
		
		String s5 = "tej";
		String s6 = new String("tej");
		System.out.println(s5==s6);// 
		System.out.println(s5.equals(s6));
		
		String s7 = "tej";
		String s8 = new String("tej");
		System.out.println(s7==s8);
		System.out.println(s7.equals(s8));
		String s9 = s8;
		System.out.println(s8.equals(s9));//true
		
		
		
		
		
		
		

	}

}
