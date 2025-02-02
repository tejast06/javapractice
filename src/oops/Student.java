package oops;

public class Student {
	
	int id;
	String name;
	
	public void print() {
		
		System.out.println(id + "" + name);
	}
	
	public void setData(int id,String name) {
		id=id;
		name=name;
		System.out.println(id +"  " + name);
	}
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
		System.out.println(id +" " + name);
		
	}

}
