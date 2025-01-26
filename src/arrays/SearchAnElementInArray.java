package arrays;

public class SearchAnElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,2,3,4,5};
		int searchEle = 8;
		
		boolean status = false;
		for(int i=0; i<a.length; i++) {
			if(a[i]==searchEle) {
				System.out.println("element found");
				status =true;
				break;
			}
			
		}
		if(status==false) {
		System.out.println("element not found");
		}

	}

}
