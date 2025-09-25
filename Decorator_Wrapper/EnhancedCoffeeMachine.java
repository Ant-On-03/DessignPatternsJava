package Decorator_Wrapper;

public class EnhancedCoffeeMachine implements CofeeMachine{
    
    private NormalCoffeeMachine machine;

    public EnhancedCoffeeMachine(NormalCoffeeMachine machine) {
        this.machine = machine;
    }

    //Override behaviour

    @Override
    public void makeSmallCOffee() {
        System.out.println("Enhanced coffee machine: making small coffee");
    }

    //Unaltered behaviour
    @Override
    public void makeLargeCoffee() {
        machine.makeLargeCoffee();
    }

    // Extended behaviour

    public void makeMilkCoffee() {
        System.out.println("Enhanced coffee machine; Making milk coffee");
        machine.makeLargeCoffee();
        System.out.println("Enhanced coffee machine: Adding milk");
    }

}
