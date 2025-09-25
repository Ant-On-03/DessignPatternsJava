package BuilderPattern;


public class Aparment {
    private int sqm;
    private int rooms;
    private String city;
    private String area;
    private boolean kitchen;


    public Aparment(int sqm, int rooms, String city, String area, boolean kitchen) {
        this.sqm = sqm;
        this.rooms = rooms;
        this.city = city;
        this.area = area;
        this.kitchen = kitchen;

    }

    public int getSqm() {
        return sqm;
    }
    // ALl other getters

    public void display() {
        System.out.println("Apartmen has:");
        if(sqm != -1) {
            System.out.println(sqm + "sqm");
        }
        if(rooms != -1) {
            System.out.println(rooms + "rooms");
        }
        if(city != "") {
            System.out.println("city is in " + city);
        }
        if(area != "") {
            System.out.println("Apartment is in " + area);
        }
        if (kitchen){
            System.out.println("Apartment has kitchen");
        }
    }
}

