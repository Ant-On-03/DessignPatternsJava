package Decorator_Wrapper;

public class NormalCoffeeMachine implements CofeeMachine{

    @Override
    public void makeSmallCOffee() {
        System.out.println("Normal coffee machine: Making small coffee");
    }

    @Override
    public void makeLargeCoffee() {
        System.out.println("Normal coffee machine: Making Large coffee"); 
   }
    
    
}
