package javademo;

public class objectInJava {
    int x = 5;

    public static void main(String[] args) {
        objectInJava myObj = new objectInJava(); 
        objectInJava myObjc = new objectInJava();
        
        System.out.println(myObj.x);
        System.out.println(myObjc.x);
    }
}
