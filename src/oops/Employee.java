package oops;

public class Employee {
	
	int id;
	String name;
	int sal;
	
	public void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.id=1;
		emp.name="abc";
		emp.sal=23000;
		emp.display();

	}

}
