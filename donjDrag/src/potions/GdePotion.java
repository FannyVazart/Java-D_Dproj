package potions;

import board.Case;

public class GdePotion extends Potions {

    private int lifePoints = 6;
    public GdePotion() {
        super("grande potion", 5);
    }

    public int getLifePoints() {
        return lifePoints;
    };

}
