package strings;

public class Stringtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "tejas"; //immutable 
		String s2 = "tejas";
		System.out.println(s1==s2);
		s1.concat("jjjjb");
		System.out.println(s1);
		
		
		
		String s3 = new String("tej");//immutable
		String s4 = new String("tej");
		System.out.println(s3==s4);
		s3.concat("jknjnjnjn");
		System.out.println(s3);
		
		StringBuffer sb = new StringBuffer("tej"); //mutable
		sb.append("nmnmnmn");
		System.out.println(sb);
		
		
		
		

	}

}
