package ennemis;

import board.Case;
import board.CaseVide;
import characters.Personnage;

public abstract class Ennemis implements Case {

    private String name;
    private int lifeLevel;
    private int forceAttaque;

    protected Ennemis(String nameEnn, int lifeLevelEnn, int forceAttaqueEnn) {
        name = nameEnn;
        lifeLevel = lifeLevelEnn;
        forceAttaque = forceAttaqueEnn;
    }

    @Override
    public void interaction(Personnage perso) {
        System.out.println("FIIIIGHT!!");
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
