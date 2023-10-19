package javademo;
class Vehicle {
	  protected String brand = "Ford";
	  public void honk() {
	    System.out.println("Tuut, tuut!");
	  }
	}

	public class inharitance extends Vehicle {
	  private String modelName = "Mustang";
	  public static void main(String[] args) {
		  inharitance myFastCar = new inharitance ();
	    myFastCar.honk();
	    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	  }
	}
