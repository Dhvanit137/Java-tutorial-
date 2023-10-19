package javademo;

public class MethodInClass {
	static void myStaticMethod() {
		System.out.println("kya bolti public ");
	}
	
	public void myPublicMethod() {
		System.out.println("kya bolte bacha log ");
	}
	public static void main(String[] args) {
		myStaticMethod();
		MethodInClass myObjt = new MethodInClass();
		myObjt.myPublicMethod();
		
				
	}
}
