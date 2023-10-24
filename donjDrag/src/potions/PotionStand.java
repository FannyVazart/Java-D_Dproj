package potions;

public class PotionStand extends Potions {

    private int lifePoints = 3;

    public PotionStand() {
        super("potion standard", 3);
    }

    public int getLifePoints() {
        return lifePoints;
    };

}
