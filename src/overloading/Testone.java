package overloading;

public class Testone {
	
	int a=10;
	int b=20;
	
	public void add() {
		System.out.println(a+b);
	}
	
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	
	public void add(int x,double y) {
		System.out.println(x+y);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
