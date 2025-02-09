package InterfaceAndAbstraction;


interface Shape{
	int lenght=10;
	int width=20;
	
	public void m1();
	default void m2() {
		System.out.println(lenght*width);
	}
	 static void m3() {
		System.out.println(lenght*width);
	}
}



public class InterfaceDemo implements Shape {
	
	public void m4() {
		System.out.println("child class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceDemo obj = new InterfaceDemo();
		obj.m1();
		obj.m2();
		Shape.m3();
		obj.m4();
		
		Shape sp = new InterfaceDemo();
		sp.m1();
		sp.m2();
		
		
		
		
		
		

	}

	@Override
	public void m1() {
		System.out.println(lenght*width);
		
	}

}
