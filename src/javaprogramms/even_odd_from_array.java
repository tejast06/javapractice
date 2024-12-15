package javaprogramms;

public class even_odd_from_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num [] = {1,2,3,4,5,6};
		for(int i=0; i<num.length; i++) {
			if(num[i]%2==0) {
				System.out.println("even num are"+ num[i]);
			}
		}
		for(int i=0; i<num.length; i++) {
			if(num[i]%2!=0) {
				System.out.println("odd num are"+ num[i]);
			}
		}

	}

}
