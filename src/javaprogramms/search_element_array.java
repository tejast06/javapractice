package javaprogramms;

public class search_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		int b = 2;
		for(int i=0; i<a.length; i++) {
			if(b==a[i]) {
				System.out.println("element found at " + i);
			}
		}

	}

}
