package flyweight;

import java.util.HashMap;
import java.util.Map;

// Redirects from the rank to the correct Fighter (singleton)

public class FighterFactory {

    static Map<FighterRank, Fighter> fighters = new HashMap<>();

    public static Fighter getFighter(FighterRank rank) {

        Fighter f = fighters.get(rank);

        if (f == null) {

            // LAZY INITIALIZATION
            f = new Fighter(rank);

            // we initialize if only once
            fighters.put(rank, f);
        }
        return f;
    }
}
