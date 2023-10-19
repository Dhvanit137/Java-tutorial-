package javademo;

public class methodOverloding {
	static int plusMethod(int x, int y) {
		return x + y ;
	}
	static double plusMethod(double x , double y) {
		return x + y ;
	}
	public static void main(String[] args) {
		int mynum1 = plusMethod(63,54);
		double mynum2 = plusMethod(36.36,63.63);
		System. out.println("int : " + mynum1);
		System.out.println("double : " + mynum2);
		
	}
	


}
