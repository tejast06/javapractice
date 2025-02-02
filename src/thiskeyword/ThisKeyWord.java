package thiskeyword;

public class ThisKeyWord {
	
	int x,y;
	public ThisKeyWord(int a, int b) {
		x=a;
		y=b;
	}
	
	public void display() {
		System.out.println(x +" " +y);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyWord th = new ThisKeyWord(15, 45);
		th.display();

	}

}
