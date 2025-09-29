package flyweight;

public class Fighter implements Sprite {
    private FighterRank rank;
    // 3 Types of fighters

    public Fighter(FighterRank rank) {
        this.rank = rank;
        // HERE WE CAN IMPLEMENT OTHER STUFF UNIQUE TO EACH FIGHTER
        // like POSITION
        // but that is not shared

    }

    public FighterRank getRank() {
        return rank;
    }   

    @Override
    public void draw() {
        System.out.println("Drawing a " + rank + " fighter");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving a " + rank + " fighter to coordinates: " + x + ", " + y);
    }
    
}
