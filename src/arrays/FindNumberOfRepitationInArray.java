package arrays;

public class FindNumberOfRepitationInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a = {1,2,3,4,1,1,5};
		int num=1;
		int cnt=0;
		for(int value:a) {
			if(value==num) {
				cnt++;
				
			}
			
		}
		System.out.println("number of duplicate elements are: " +cnt);

	}

}
