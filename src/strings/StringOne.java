package strings;

public class StringOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "tejas"; //object stored in scp
		System.out.println(s1);
		
		String s2 = new String("tejas");// object stored in heap memory
		System.out.println(s2);
		
		StringBuffer s3 = new StringBuffer("tejas");
		System.out.println(s3);

	}

}
