package exceptionhandling;

public class TryCatchWithFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("program started");
		
		String s=null;
		
		try {
		System.out.println(s.length());
		}

		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("you entered into finally block");
		}

	}

}
