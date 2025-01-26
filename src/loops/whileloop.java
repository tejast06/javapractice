package loops;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i=1;
//		
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		
//		int i=1;
//		while(i<=10) {
//			System.out.println("hello");
//			i++;
//		}
		
		//print even number between 1 to10
//		int i=2;
//		while(i<=10) {
//			System.out.println(i);
//			i+=2;
//			
//		}
		
		int  i=1;
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i +"Even");
			}
			else {
				System.out.println(i +"Odd");
			}
			i++;
		}

	}

}
