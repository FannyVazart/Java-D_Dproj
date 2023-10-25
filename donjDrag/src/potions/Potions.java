package potions;

import board.Case;
import characters.Personnage;


public abstract class Potions implements Case  {

    private String name;
    private int lifePoints;

    protected Potions(String namePot, int lifePointsPot) {
        name = namePot;
        lifePoints = lifePointsPot;
    }

    @Override
    public void interaction(Personnage perso) {
        perso.setLifeLevel(perso.getLifeLevel() + getLifePoints());

        System.out.println("Nouveaux points de vie: " + perso.getLifeLevel());
    }

//    public int modifLife(int ptsLife) {
//        ptsLife += lifePoints;
//        return ptsLife;
//    }

    public String toString() {

        return "C'est une " + getName() + "!! Tu gagnes " + getLifePoints() +
                " points de vie !";
    }

    public String getName() {
        return name;
    }

    public abstract int getLifePoints();

}