package offense;

import board.CaseVide;

public abstract class EquipementOffensif extends CaseVide {
    private int attaqueLevel;
    private String name;

    public EquipementOffensif(int attaqueLevelEq, String nameEq) {
        attaqueLevel = attaqueLevelEq;
        name = nameEq;
    }

    public String toString() {

        return "C'est un(e) " + getName() + ", qui a " + getAttaqueLevel() + " points d'attaque.";
    }

    public int getAttaqueLevel() {
        return attaqueLevel;
    }

    public String getName() {
        return name;
    }

}
