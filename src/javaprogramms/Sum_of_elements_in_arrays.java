package javaprogramms;

public class Sum_of_elements_in_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of array is " +sum);

	}

}
