package wrappers;

public class DataConversionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "welcome";
	 	Integer.parseInt(s); //cannot convert to int. number format exception.
	 	
	 	String s1 = "1";
	 	String s2 = "2";
	    int i1=Integer.parseInt(s1);
	    int i2=Integer.parseInt(s2);
	    System.out.println(i1+i2);
	    
	    String s3 = "10.5";
	    String s4 = "2.5";
	    System.out.println(Double.parseDouble(s3) + Double.parseDouble(s4));
	    
	 	

	}

}
