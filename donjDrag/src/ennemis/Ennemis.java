package ennemis;

import board.Board;
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
    public int interaction(Personnage perso) {
        punch(perso);
        return getLifeLevel();
    }

    public void punch(Personnage perso) {
        System.out.println("Que le combat commence...");
        setLifeLevel(getLifeLevel() - perso.getForceAttaque());
        if (getLifeLevel() > 0) {
            perso.setLifeLevel(perso.getLifeLevel() - getForceAttaque());
            System.out.println("L'ennemi t'a touché ! Tes nouveaux points de vie: " + perso.getLifeLevel());
        } else {
            System.out.println("Bravo, tu as vaincu l'ennemi, il a disparu !");
        }
//        setLifeLevel(getLifeLevel() + perso.getForceAttaque());
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

    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

}
