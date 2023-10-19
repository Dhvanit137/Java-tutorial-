package javademo;

public class constuctorsInJava {
	
		  int x;

		  public constuctorsInJava(int y) {
		    x = y;
		  }

		  public static void main(String[] args) {
			  constuctorsInJava myObj = new constuctorsInJava(999);
		    System.out.println(myObj.x);
		  }
		}

