package _02_gotta_catchem_all;

public class ExceptionMethods  {
	public double divide(double a, double b) throws IllegalArgumentException {
		if(b == 0) {
			throw new IllegalArgumentException();
		}
		
		return a/b;
	}
	public String reverseString(String a) throws IllegalStateException{
		String b = "";
		if(a.equals("")) {
			throw new IllegalStateException();
		}
		for(int i = a.length() -1 ; i >= 0; i--) {
			b += a.charAt(i);
		}
		return b;
	}
}
