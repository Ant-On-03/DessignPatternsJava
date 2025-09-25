package BuilderPattern;

public class Client {

    public static void main(String[] args) {
        
        ApartmentBuilder builder = new ApartmentBuilder();
        Aparment a1 = builder
            .setSqm(25)
            .setRooms(2)
            .setCity("London")
            .setArea("Kensington")
            .setKitchen(true).build();
        a1.display();

        ApartmentBuilder builder2 = new ApartmentBuilder();
        Aparment a2 = builder2
            .setRooms(3)
            .setCity("Paris")
            .build();

        a2.display();
    }
}