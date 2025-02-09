package inheritance;


class Bank{
	double roi() {
		return 0;
	}
}

class ICICI extends Bank{
	double roi() {
		return 12.5;
	}
	
}



class A{
	int a=100;
	public void print() {
		System.out.println(a);
	}
}

class B extends A{
	int b=200;
	public void display() {
		System.out.println(b);
	}
}

class C extends B{
	int c=300;
	public void display() {
		System.out.println(c);
	}
}

public class InheritanceType {
	
	public static void main (String[] args) {
//		B b = new B();
//		System.out.println(b.a);
//		System.out.println(b.b);
//		b.display();
//		b.print();
//		
//		C c = new C();
		
		ICICI obj = new ICICI();
		obj.roi();
		
		
		
	}
	

}
