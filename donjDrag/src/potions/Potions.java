package potions;

import board.CaseVide;

public class Potions extends CaseVide {

    private String name;
    private int lifePoints;

    protected Potions(String namePot, int lifePointsPot) {
        name = namePot;
        lifePoints = lifePointsPot;
    }

    public String toString() {

        return "C'est une " + getName() + "!! Tu gagnes " + getLifePoints() +
                "points de vie !";
    }

    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

}