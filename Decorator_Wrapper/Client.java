package Decorator_Wrapper;

public class Client {
    public static void main(String[] args) {

        NormalCoffeeMachine normal = new NormalCoffeeMachine();
        EnhancedCoffeeMachine enhanced = new EnhancedCoffeeMachine(normal);

        normal.makeSmallCOffee();
        normal.makeLargeCoffee();
        enhanced.makeSmallCOffee();
        enhanced.makeLargeCoffee();
        enhanced.makeMilkCoffee();

    }
}