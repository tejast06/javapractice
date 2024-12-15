package javaprogramms;

public class duplicate_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] a = {"java","c","java"};
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] == a[j]) {
					System.out.println("duplicare found" + a[i]);
				}
			}
		}

	}

}
