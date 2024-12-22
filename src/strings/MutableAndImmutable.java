package strings;

public class MutableAndImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("new");
		System.out.println(s);
	    String s2 = 	s.concat("ffff");
		System.out.println(s);
		System.out.println(s2);

	}

}
