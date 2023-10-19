package javademo;

 class Animal {
	 public void animalsound() {
		 System.out.println("the animal make a sound");
	 }

}

 class pig extends Animal {
	 public void animalsound() {
		 System.out.println("wee wee weee weeeeee");
		 
	 }
}
 
 class dog extends Animal {
	 public void animalsound() {
		 System.out.println("bow bow bowww bowwww");
	 }
 }
 public  class polymorphismInJava {
	 public static void main(String [] args ) {
		 Animal myAnimal = new Animal() ;
		 Animal myPig = new pig();
		 Animal myDog = new dog();
		 myAnimal.animalsound();
		 myPig.animalsound();
		 myDog.animalsound();
		 
		 
		 }
 }