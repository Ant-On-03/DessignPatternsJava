package Prototype;

public class Client {
    
    public static void main(String[] args) {
        Vehicle c1 = new Car(4, 30000, "red");
        Vehicle c2 = c1.clone();

        c1.isClone(c2);
    }
}
