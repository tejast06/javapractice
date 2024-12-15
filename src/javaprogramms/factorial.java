package javaprogramms;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		long fact=1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println("factorial num is " +fact);

	}

}
