package javaprogramms;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=6;
		int cnt=0;
		if(num>1) {
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					cnt++;
				}
				
			}
			if(cnt==2) {
				System.out.println("number is prime");
			}
			else {
				System.out.println("number is not prime");
			}
		}

	}

}
