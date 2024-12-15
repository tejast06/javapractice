package javaprogramms;

public class count_number_of_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int evenCnt=0;
		int oddCnt=0;
		while(num>=0) {
			int rem=num%10;
			if(rem%2==0) {
				evenCnt++;
			}
			else {
				oddCnt++;
			}
			num=num/10;
		}
		System.out.println("even cnt:" +evenCnt);
		System.out.println("odd cnt:" +oddCnt);

	}

}
