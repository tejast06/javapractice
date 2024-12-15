package javaprogramms;

public class count_number_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234;
		int cnt=0;
		while(num>0) {
			num=num/10;
			cnt++;
		}
		System.out.println(cnt);

	}

}
