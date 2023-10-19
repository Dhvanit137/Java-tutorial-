package javademo;

public class MethodInClass {
	static void myStaticMethod() {
		System.out.println("hello people ");
	}
	
	public void myPublicMethod() {
		System.out.println("hello world ");
	}
	public static void main(String[] args) {
		myStaticMethod();
		MethodInClass myObjt = new MethodInClass();
		myObjt.myPublicMethod();
		
				
	}
}
