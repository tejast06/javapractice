package strings;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("tej");
		sb.append("nmnmnm");
		System.out.println(sb);
		
		StringBuilder s = new StringBuilder("tej");
		s.append("as");
		System.out.println(s);
		

	}

}
