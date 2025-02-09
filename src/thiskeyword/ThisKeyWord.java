package thiskeyword;

import staticdemo.StaticExample;

public class ThisKeyWord {
	
	int x,y;
	public ThisKeyWord(int x, int y) {
		this.x=x;
		this.x=y;
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
