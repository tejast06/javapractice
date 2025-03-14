package typecasting;


class parent{
	String name="aaa";
	public void m1() {
		System.out.println("this is m1 method from parent");
	}
}

class child extends parent{
	int i=12;
	public void m2() {
		System.out.println("this is m2 method from child");
	}
	
}




public class TypeCastingForObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		child c = new child();
//		System.out.println(c.name);
//		c.m1();
//		System.out.println(c.i);
//		c.m2();
		
		//parent p = new child(); //upcasting.
		
		

	}

}
