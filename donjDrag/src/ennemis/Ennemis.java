package ennemis;

import board.CaseVide;

public abstract class Ennemis extends CaseVide {

    private String name;
    private int lifeLevel;
    private int forceAttaque;

    protected Ennemis(String nameEnn, int lifeLevelEnn, int forceAttaqueEnn) {
        name = nameEnn;
        lifeLevel = lifeLevelEnn;
        forceAttaque = forceAttaqueEnn;
    }

    public String toString() {

        return "C'est un " + getName() + "!! Niveau de vie: " + getLifeLevel() +
                ". Force d'attaque: " + getForceAttaque() + ".";
    }

    public String getName() {
        return name;
    }

    public int getLifeLevel() {

        return lifeLevel;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }


}
