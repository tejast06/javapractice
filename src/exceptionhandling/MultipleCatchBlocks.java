package exceptionhandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("program started");
		
		String s=null;
		
		try {
		System.out.println(s.length());
		}
//		catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//		catch (NullPointerException e) {
//			System.out.println(e.getMessage());
//		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
