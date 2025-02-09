package staticdemo;

public class StaticExample {
	
	static int a=10;
	int b=20;
	
	static void m1() {
		System.out.println("static method");
	}
	
	void m2() {
		System.out.println("non static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static method can access directly
	     System.out.println(a);
	     m1();
	     
	     //non static methods and var can access through object.
	     StaticExample se = new StaticExample();
	     se.b=10;
	     se.m2();
	     

	}

}
