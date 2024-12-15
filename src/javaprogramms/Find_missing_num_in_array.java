package javaprogramms;

public class Find_missing_num_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,4,5};
		int sum1=0;
		for(int i=0; i<a.length; i++) {
			sum1=sum1+a[i];
		}
		int sum2=0;
		
		for(int i=0; i<=5; i++) {
			sum2=sum2+i;
		}
		
		System.out.println("missing num is" + (sum2-sum1));

	}

}
