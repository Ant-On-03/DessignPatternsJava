package Composite;

public class Client {
    public static void maiun(String[] args) {
        Composite computer = new Composite("Computer");
        Equipment processor = new Equipment("Processor", 1000);
        Equipment hdd = new Equipment("HDD", 150);
        Composite memory = new Composite("Memory");
        Equipment rom = new Equipment("ROM", 100);
        Equipment ram = new Equipment("RAM", 200);

        memory.add(rom).add(ram);
        computer.add(processor).add(hdd).add(memory);

        System.out.println("Total price: " + computer.getPrice());
    }
    
}
