package inheritance;


class ABC{
	public void m1(int a) {
		System.out.println(a);
	}
	
	public void m2(int b) {
		System.out.println(b);
		
	}
}

class XYZ extends ABC{
	public void m1(int a) {
		System.out.println(a*a);
	}
	
	public void m2(int b, int a) {
		System.out.println(b+a);
		
	}
	
	
}

public class Overridingvsoverloading {
	
	public static void main (String[] args) {
		XYZ xyz = new XYZ();
		
	}

}
