package superkeyword;

public class Parent {
	
	int a=100;
	public void parent(){
		System.out.println("parent method");
	}

}

class Child extends Parent{
	
	int a=200;
	public void display() {
		System.out.println(super.a);
	}
	public void parent() {
		//System.out.println("child method");
		super.parent();
	}
	
}
